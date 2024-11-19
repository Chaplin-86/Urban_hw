import static java.util.stream.Stream.concat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Написать функциональный интерфейс Printable с методом print().
         * В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
         * 2. Написать функциональный интерфейс Concationable с методом concat(),
         * который объединяет две строковых переменных, передаваемых в параметры метода и возвращает строку.
         * В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().
         */

        //Task 1


        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Начал печать");
            }
        };
        Printable printable1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Цветная печать");
            }
        };

        Printable printable2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать на футболке");
            }
        };

        printable.print();
        printable1.print();
        printable2.print();

        System.out.println("_____________________");

        //Task 2

        System.out.println(joinTwoLines("Hello", " world", ((str1, str2) -> str1 + str2)));

    }

    public static String joinTwoLines(String str1, String str2, Concationable<String, String> concationable) {
        return concationable.concat(str1, str2);
    }

    @FunctionalInterface
    interface Concationable<T, V> {
        String concat(T t, V v);
    }
}
