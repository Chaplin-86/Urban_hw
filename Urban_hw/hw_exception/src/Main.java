//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TODO перенести методы в Main, классы удалить
        /**
         * Task 1
         * Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное.
         * Необходимо протестировать ее в методе main с разными числами.
         */

        System.out.println(isEven(5));

        /** Task 2
         * ***Напишите метод, который принимает строку в качестве входных данных и выдает исключение,
         * если строка содержит числа.
         */

        System.out.println(checkNumeric("В корзине 5 яблок"));

    }

    public static boolean isEven(int num) {
        if(num % 2 == 0){
            return true;
        } else {
            throw new RuntimeException("Ошибка!!! " + num + " - нечетное число");
        }
    }

    public static boolean checkNumeric(String str)  {
        for(char chr : str.toCharArray()) {
            if(Character.isDigit(chr)) {
                throw new RuntimeException("Строка содержит числа");
            }
        }
        return true;
    }

}

