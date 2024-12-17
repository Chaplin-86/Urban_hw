
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
         * Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке,
         * состоящего из нескольких слов.
         */

        //Task 1

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(17);
        numbers.add(23);
        numbers.add(30);

        Expression expression = (n) -> n % 2 == 0;

        System.out.println(sumOfEven(numbers, expression));

        //Task 2

        List<String> stationary = new ArrayList<>();
        stationary.add("pencil");
        stationary.add("ruler");
        stationary.add("pencil sharpener");
        stationary.add("pencil case");
        stationary.add("rubber");
        stationary.add("scissors");
        stationary.add("paper clip");

        StringExpression exp = list -> {
            if (list.isEmpty()) {
                return null;
            }
            String longestWord = list.get(0);
            for (String s : list) {
                if (s.length() > longestWord.length()) {
                    longestWord = s;
                }
            }
            return longestWord;
        };
        String result = findInStringList(stationary, exp);
        System.out.println(result);
    }



    public static int sumOfEven(List<Integer> list, Expression exp) {
        int result = 0;
        for (int element : list) {
            if (exp.isEqual(element)) {
                result += element;
            }
        }
        return result;
    }

    public static String findInStringList(List<String> list, StringExpression exp) {
        return exp.getStringByCondition(list);
    }
}

interface Expression {
    boolean isEqual(int a);
}

interface StringExpression {
    String getStringByCondition(List<String> list);

}