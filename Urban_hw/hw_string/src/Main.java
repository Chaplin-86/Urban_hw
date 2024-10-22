import java.util.Arrays;

import static java.lang.String.valueOf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * Task 1
         * Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}.
         * Получите массив символов этих строк: char[] charArray =  {'a', 'b', 'c', 'd', 'e', 'f'}.
         */

        /**
         * - сосчитать сколько всего символов в первом массиве
         * - создать новый массив (символов) использую высчитанную длинну
         * - пройти по первому массиву в цикле
         * - каждую строку из первого представить в виде массива символов и тоже по нему пройти циклом(вложенным)
         * и каждый символ положить в новый массив.
         * Для этого нужно завести переменную-счетчик отдельно от циклов,
         * чтобы символы в новый массив складывались друг за другом
         */

        String[] stringArray = {"ab", "cd", "ef"};

        int count = 0;

        for(String str : stringArray) {
            count += str.length();
        }
        System.out.println(count);

        char[] charArray = new char[count];

        count = 0;
        for(String str : stringArray){
            char[] element = str.toCharArray();
            for(char chr : element) {
                charArray[count++] = chr;
            }
        }
        System.out.println(Arrays.toString(charArray));


        /**
         * Task 2
         * Дана строка: String stroke = "12345".
         * Выведите в консоль значение, которое можно, взяв первый и последний символ этой строки в следующем виде.
         * Т.е. "15".
         */

//        String stroke = "12345";
//        String first = valueOf(stroke.charAt(0));
//        String last = valueOf(stroke.charAt(4));
//        String result = first.concat(last);
//        System.out.println(result);


        /**
         * Task 3
         * Дана некоторая строка - "1203405". Найдите позицию первого нуля в строке.
         * Т.е. позиция первого нуля в этой строке равна 2.
         */

//        String some = "1203405";
//        System.out.println(some.indexOf("0"));

    }
}

