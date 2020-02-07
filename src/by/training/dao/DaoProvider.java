package by.training.dao;

import by.training.dao.impl.SQLUserDao;

public class DaoProvider {

    private static final DaoProvider instance = new DaoProvider();
    private final UserDao dao = new SQLUserDao();

    private DaoProvider() {
    }

    public UserDao getDao() {
        return dao;
    }

    public static final DaoProvider getInstance() {
        return instance;
    }
}
