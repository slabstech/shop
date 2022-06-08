package com.slabstech.revive.server.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        LOGGER.info("Application name: {}", configuration.getAppName());
    }
}