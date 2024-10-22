//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task 1
         * Вывести в консоль значения диапазона чисел от 1 до 50 кратные 3
         * с использованием цикла while.
         */

//        int num = 0;
//        int limit = 50;
//        while (num < limit) {
//            num++;
//            if (num % 3 == 0) {
//                System.out.println(num);
//            }
//        }

        /**
         * Task 2
         * Напишите программу, которая находит сумму всех чисел от 1 до 100
         * с использованием цикла for.
         */


        int total = 0;
        for(int num = 1; num <=100; num++) {
            total = total + num;
            System.out.println("Сумма равна: " + total);

        }

    }
    }
