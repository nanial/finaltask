package by.training.service.impl;

import by.training.bean.User;
import by.training.dao.DaoProvider;
import by.training.dao.UserDao;
import by.training.dao.impl.DaoException;
import by.training.dao.impl.SQLUserDao;
import by.training.service.UserService;
import by.training.service.exception.ServiceException;
import by.training.service.validation.UserDataValidator;

public class UserServiceImpl implements UserService {

    private static final UserDataValidator validator = UserDataValidator.getInstance();
    private static  final UserDao dao = DaoProvider.getInstance().getDao();

    @Override
    public User authorization(String login, String password) throws ServiceException {
        User user;

        if(!validator.check(login, password)){

            throw new ServiceException("Login/password incorrect");
        }

        try {
            user = dao.authorization(login, password);
        }
        catch (DaoException de){
            throw new ServiceException(de);
        }
        return user;
    }
}
