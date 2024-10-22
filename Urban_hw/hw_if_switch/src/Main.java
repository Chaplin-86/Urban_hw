//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         *  Даны два числа x и y.
         *  Программа должна вывести в консоль «Удачное совпадение», – если оба числа четные,
         *  либо оба числа нечетные.
         *  Иначе программа ничего не выводит.
          */

        /**
         * Task 1
         */

//        int x = 5;
//        int y = 13;
//
//        if (x % 2 == 0 && y % 2 == 0) {
//            System.out.println ("Удачное совпадение");
//        } else if (x % 2 != 0 && y % 2 != 0) {
//            System.out.println ("Удачное совпадение");
//        } else {
//            System.out.println (" ");
//        }

        /**
         * В переменной day лежит какое-то число из интервала от 1 до 31.
         * Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
         */

        /**
         * Task 2
         */

//        int day = 18;
//        boolean resultOne = (day >= 1) && (day <= 10);
//        boolean resultTwo = (day >= 11) && (day <= 20);
//        boolean resultThree = (day >= 21) && (day <= 31);
//
//        if(resultOne) {
//            System.out.println("Первая декада");
//        } else if (resultTwo) {
//            System.out.println("Вторая декада");
//        } else if (resultThree) {
//                System.out.println ("Третья декада");
//        }
        int day = 18;

        if((day >= 1) && (day <= 10)) {
            System.out.println("Первая декада");
        } else if ((day >= 11) && (day <= 20)) {
            System.out.println("Вторая декада");
        } else if ((day >= 21) && (day <= 31)) {
                System.out.println ("Третья декада");
        }


        /**
         * Мой вариант Задание 2 - не рабочий, т.к. switch так не работает,
         * нужно указывать конкретные значения,
         * например, case day = 1, case day = 2 и т.д.
         * Т.е. получается много кода
         */

//        int day = 18;
//        boolean result;
//
//        switch (day) {
//            case result = (day >= 1) && (day <= 10):
//                System.out.println("Первая декада");
//            break;
//            case result = (day >= 11) && (day <= 20):
//                System.out.println("Вторая декада");
//            break;
//            case result = (day >= 21) && (day <= 31):
//                System.out.println("Третья декада");
//            break;
//            }





    }
}