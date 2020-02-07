package by.training.service.validation;

public class UserDataValidator {

    private static final UserDataValidator instance =
            new UserDataValidator();

    private UserDataValidator(){}

    public static UserDataValidator getInstance(){
        return instance;
    }
    public boolean check(String login, String password){
        return true;
    }
}
