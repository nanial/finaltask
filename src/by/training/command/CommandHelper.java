package by.training.command;

import by.training.command.impl.AuthorizationCommand;
import by.training.command.impl.NoSuchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {

    private static final CommandHelper instance = new CommandHelper();

    public static CommandHelper getInstance(){
        return instance;
    }
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper(){

        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
        commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
    }

    public Command getCommand(String commandName){

        CommandName name = CommandName.valueOf(commandName.toUpperCase()
                .replaceAll("_", "-"));
        Command command;
        if(null != name){
            command = commands.get(name);
        }
        else {
            command = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command;
    }
}
