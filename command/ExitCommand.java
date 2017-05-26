package com.javarush.task.task31.task3110.command;


import com.javarush.task.task31.task3110.ConsoleHelper;

/**
 * Created by amalakhov on 26.05.2017.
 */
public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
