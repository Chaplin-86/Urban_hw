
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        /**
         *
         1. Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
         2. Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков.
         */

        //Task 1

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(16);
        numbersList.add(48);
        numbersList.add(97);
        numbersList.add(54);
        numbersList.add(113);
        numbersList.add(207);
        numbersList.add(618);

        Optional<Integer> resultEven = numbersList.stream().filter(element -> element % 2 == 0).reduce((x, y) -> x + y);
        System.out.println("Сумма четных чисел" + " " + resultEven.get());

        Optional<Integer>resultOdd = numbersList.stream().filter(element -> element % 2 != 0).reduce((x, y) -> x + y);
        System.out.println("Сумма нечетных чисел" + " " + resultOdd.get());

        //Task 2

        List<String> namesBoys = new ArrayList<>();
        namesBoys.add("Артём");
        namesBoys.add("Богдан");
        namesBoys.add("Ваня");
        namesBoys.add("Лука");
        namesBoys.add("Сева");
        namesBoys.add("Богдан");
        namesBoys.add("Лёша");
        namesBoys.add("Богдан");
        namesBoys.add("Дима");
        namesBoys.add("Клим");





    }


}