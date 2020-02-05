package by.training.command.impl;

import by.training.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthorizationCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("login"));
        System.out.println(request.getParameter("pass"));
        System.out.println(request.getParameter("command"));

    }
}
