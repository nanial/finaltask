package by.training.service;

import by.training.service.impl.UserServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();
    private UserService userService = new UserServiceImpl();

    private ServiceProvider() {
    }

    public UserService getUserService() {
        return userService;
    }

    public static ServiceProvider getInstance() {
        return instance;
    }
}
