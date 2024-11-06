import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1

        List<String> colourList = new ArrayList<>();
        colourList.add("red");
        colourList.add("orange");
        colourList.add("yellow");
        colourList.add("green");
        colourList.add("blue");
        colourList.add("purple");

        boolean result = findElement(colourList, "red");
        System.out.println(result);

        System.out.println("_________________________");

        //Task 2

        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(0);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        exchangeElements(numberList);


    }

    //Task 1

    public static boolean findElement(List<String> list, String element) {
        if(list.contains(element)) {
            return true;
        }

        return false;
    }

    public static void exchangeElements(LinkedList<Integer> list) {
        int i = list.size() - 1;
        int element1 = list.get(0);
        int element2 = list.get(i);

        list.removeFirst();
        list.removeLast();

        list.addFirst(element2);
        list.addLast(element1);

        System.out.println(list);




    }



}