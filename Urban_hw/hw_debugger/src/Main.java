import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
         * 2. Дана строка "Привет, Александр, с праздником, с Новым Годом".
         * Написать программу, которая поменяет регистр символов. Т.е. результат должен быть таким:
         * пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ.
         */

        //Task 1

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 15, 8, 4, 19, 24, 35, 46,79, 105)
        );
        Optional<Integer>maxEven = numbers.stream().filter(element -> element % 2 == 0).max(Integer::compare);
        System.out.println(maxEven.get());

        System.out.println("____________________");

        //Task 2

        String str = "Привет, Александр, с праздником, с Новым Годом"; //пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ
        System.out.println(changeCase(str));

    }

    public static String changeCase(String str)  {
        StringBuilder sb = new StringBuilder();
        for(char chr : str.toCharArray()) {
            if(Character.isLowerCase(chr)) {
               sb.append(Character.toUpperCase(chr));
            } else if (Character.isUpperCase(chr)) {
                sb.append(Character.toLowerCase(chr));
            } else{
                sb.append(chr);
            }

        }
        return sb.toString();
    }

}