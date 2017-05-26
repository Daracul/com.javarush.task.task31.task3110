package com.javarush.task.task31.task3110;


import com.javarush.task.task31.task3110.exception.WrongZipFileException;


import java.io.IOException;

/**
 * Created by amalakhov on 26.05.2017.
 */
public class Archiver {
    public static void main(String[] args) throws IOException {
        Operation operation=null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            }
            catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("WrongZipFileException");
            }
            catch (Exception ex) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        }
        while (operation!=Operation.EXIT);

        }

    public static Operation askOperation() throws IOException{
        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage(Operation.CREATE.ordinal()+" - упаковать файлы в архив");
        ConsoleHelper.writeMessage(Operation.ADD.ordinal()+" - добавить файл в архив");
        ConsoleHelper.writeMessage(Operation.REMOVE.ordinal()+" - добавить файл в архив");
        ConsoleHelper.writeMessage(Operation.EXTRACT.ordinal()+" - распаковать архив");
        ConsoleHelper.writeMessage(Operation.CONTENT.ordinal()+" - просмотреть содержимое архива");
        ConsoleHelper.writeMessage(Operation.EXIT.ordinal()+" - выход");
        int i=ConsoleHelper.readInt();
        return Operation.values()[i];


    }
}
