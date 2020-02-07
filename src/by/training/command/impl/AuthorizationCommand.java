package by.training.command.impl;

import by.training.bean.User;
import by.training.command.Command;
import by.training.command.RequestParametrName;
import by.training.controller.JSPPageName;
import by.training.service.ServiceProvider;
import by.training.service.UserService;
import by.training.service.exception.ServiceException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AuthorizationCommand implements Command {

    UserService service  = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException{

        String login;
        String password;
        login = request.getParameter(RequestParametrName.REQ_PARAM_LOGIN);
        password = request.getParameter(RequestParametrName.REQ_PARAM_PASSWORD);

        User user;

        try{
            user = service.authorization(login, password);
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPageName.USER_AUTH_PAGE);
            dispatcher.forward(request, response);
        }
        catch (ServiceException e){

        }

    }
}
