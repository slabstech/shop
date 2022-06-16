package com.slabstech.revive.server.dropwizard.auth;
import io.dropwizard.auth.Authorizer;

import com.slabstech.revive.server.dropwizard.core.User;

public class ShopAuthorizer implements Authorizer<User> {

    @Override
    public boolean authorize(User user, String role) {
        return user.getRoles() != null && user.getRoles().contains(role);
    }
}
