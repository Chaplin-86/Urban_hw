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

        CheckArray<Integer> checkArray = new CheckArray<>(array1, array2);
        boolean result = checkArray.checkArraysSame(array1, array2);
        System.out.println(result);


        //Task 2

        //???








    }

}