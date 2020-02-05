package by.training.command.impl;

import by.training.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoSuchCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("no such command");
    }
}
