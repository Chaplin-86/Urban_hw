import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
         * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
         * 2. Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
         * которые больше 15 и являются четными.
         * Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2
         */

        //Task 1

//        Set<String> colourCars = new HashSet<>(new Comparator<>() {
//
//
//            @Override
//            public int compare(int o1, int o2) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        });
//        colourCars.add("red");
//        colourCars.add("blue");
//        colourCars.add("green");
//        colourCars.add("yellow");
//        colourCars.add("brown");
//
//        Set<String>colourBikes = new HashSet<>();
//        colourBikes.add("blue");
//        colourBikes.add("yellow");
//        colourBikes.add("orange");
//        colourBikes.add("black");
//        colourBikes.add("purple");
//
//        if(colourCars.equals(colourBikes)) {
//
//
//        }

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(46);
        numbers.add(13);
        numbers.add(348);
        numbers.add(-10);

        System.out.println(numbers);


        for(Integer number : numbers) {
            if(number > 15 && number % 2 == 0) {
                System.out.println("Первая группа чисел " + number);
            } else {
                System.out.println("Вторая группа чисел " + number / 2);
            }
        }


    }
}