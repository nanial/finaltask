package by.training.controller;

import by.training.command.Command;
import by.training.command.CommandHelper;
import by.training.command.RequestParametrName;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final CommandHelper helper = CommandHelper.getInstance();

    public Controller() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        super.service(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String commandName;
        Command command;

        commandName = request.getParameter(RequestParametrName.REQ_PARAM_COMMAND_NAME);
        command = helper.getCommand(commandName);

        command.execute(request, response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.getWriter().println("<h1>hello</h1>");

    }
}
