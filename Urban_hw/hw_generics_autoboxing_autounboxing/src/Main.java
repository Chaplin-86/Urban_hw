import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Напишите метод, который принимает два массива одного типа и проверяет, содержат ли они одинаковые элементы
         * в одном и том же порядке.
         * 2. Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
         */

        //Task 1

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};

        boolean result = checkArraysSame(array1, array2);
        System.out.println(result);


        //Task 2

        swapPlaces(array2, 1, 2);

        System.out.println(Arrays.toString(array2));

    }

    public static<T> boolean checkArraysSame(T[] array1, T[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0; i < array1.length; i++) {
            if(!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static<T> void swapPlaces(T[] array, int a, int b) {
        if(a < 0 || a >= array.length || b <0 || b >= array.length) {
            return;
        }

        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

}