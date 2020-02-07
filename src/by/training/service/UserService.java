package by.training.service;

import by.training.bean.User;
import by.training.service.exception.ServiceException;

public interface UserService {
    User authorization(String login, String password) throws ServiceException;
}
