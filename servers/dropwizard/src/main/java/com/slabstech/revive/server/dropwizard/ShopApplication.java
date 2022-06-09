package com.slabstech.revive.server.dropwizard;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.slabstech.revive.server.dropwizard.resources.ShopResource;
import com.slabstech.revive.server.dropwizard.health.TemplateHealthCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopApplication extends Application<ShopConfiguration> {
    public static void main(String[] args) throws Exception {

        new ShopApplication().run(args);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(ShopApplication.class);

    @Override
    public String getName() {
        return "Shop Application";
    }

    @Override
    public void initialize(Bootstrap<ShopConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ShopConfiguration configuration,
                    Environment environment) {

        LOGGER.info("Application name: Shop");
        final ShopResource resource = new ShopResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());


        environment.healthChecks().register("template", healthCheck);


        environment.jersey().register(resource);
    }

}