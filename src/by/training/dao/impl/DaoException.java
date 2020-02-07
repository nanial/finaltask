package by.training.dao.impl;

public class DaoException extends Exception {
    public DaoException(Exception e) {
        super(e);
    }
    public DaoException(String message) {
        super(message);
    }
}
