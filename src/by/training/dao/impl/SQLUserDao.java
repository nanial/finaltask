package by.training.dao.impl;

import by.training.bean.Role;
import by.training.bean.User;
import by.training.dao.UserDao;

public class SQLUserDao implements UserDao {
    @Override
    public User authorization(String login, String password) throws DaoException {
        //realize poolConnection

        return new User("admin", Role.ADMIN);
    }
}
