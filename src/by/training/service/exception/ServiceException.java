package by.training.service.exception;

public class ServiceException extends Exception{

    public ServiceException(Exception e) {
        super(e);
    }
    public ServiceException(String message) {
        super(message);
    }
}
