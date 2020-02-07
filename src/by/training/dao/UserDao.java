package by.training.dao;

import by.training.bean.User;
import by.training.dao.impl.DaoException;

public interface UserDao {

    User authorization(String login, String password) throws DaoException;
}
