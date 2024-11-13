//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Необходимо написать программу, которая дописывает файл. Программа предлагает записать данные фразой
 * "Вводите данные для записи". После того как введены данные в консоль
 * (необходимо использовать класс Scanner для ввода данных в консоль),
 * программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
 * Вся работа по заполнению файла ведется в бесконечном цикле.
 * Если пользователь введет 0, программа завершается строкой «Файл создан»
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Введите данные для записи");
        do {
            input = scanner.nextLine();
            if(input.equals("0")){
                System.out.println("Файл создан");
                fileWriter.close();
                break;
            }

            fileWriter.write(input + "\n");

            System.out.println("Введите что-нибудь еще");
        } while (true);

    }
}