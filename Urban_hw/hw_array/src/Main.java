//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Task 1
         * Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
         * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
         */

        /**
         * Вариант 1
         */
        int[] array2 = {3, 87, 12, 98, 2, 4, 66};
        for(int i = 6; i <= array2.length && i >= 0; i--) {
           System.out.println(array2[i]);
        }

        /**
         * Вариант 2
         */
//        int[] array2 = {3, 87, 12, 98, 2, 4, 66};
//        for(int i = array2.length - 1; i >= 0; i--) {
//            System.out.println(array2[i]);
//        }

        /**
         * Вариант 3
         */
//        int[] array2 = {3, 87, 12, 98, 2, 4, 66};
//        for(int i = 0; i < array2.length; i++) {
//            System.out.println(array2[array2.length - i - 1]);
//        }

        /**
         * Вариант 4
         */
//        int[] array2 = {3, 87, 12, 98, 2, 4, 66};
//        for(int i = 1; i <= array2.length; i++) {
//            System.out.println(array2[array2.length - i]);
//        }


        /**
         * Task 2
         *  Дан произвольный массив чисел с плавающей точкой.
         *  Необходимо отсортировать его по убыванию.
         */

        double[] array1 = {2.5, 15.3, 6.0, 18.6, 1.4};
        System.out.println("Сортировка массива по убыванию: ");
        System.out.println(Arrays.toString(sortArray(array1)));

        /**
         * Task 3
         * Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}.
         * Необходимо вывести в консоль четные элементы массива.
         */

        int[] array = {6, 117, 44, 5, 32, 81, 9};
        System.out.println(Arrays.toString(evenArray(array)));

   }

    public static int[] evenArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
               System.out.println(array[i]);
            }
        }
        return array;
    }

    public static double[] sortArray(double[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        return array;
    }


}