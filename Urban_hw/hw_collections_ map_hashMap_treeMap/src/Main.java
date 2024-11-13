import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает набор ключей,
         * содержащихся в этой карте.
         * 2. Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает ассоциативный
         * массив, состоящий из элементов исходного map, при условии, что туда войдут элементы с длиной строки более 3.
         * Т.е. исходный map: [1="Red",2="Green",3="Black"].
         * Новый map: [2="Green",3="Black"].
         */

        //Task 1

        HashMap<Integer, String> potionsIds = new HashMap<>();
        potionsIds.put(1, "Love potion");
        potionsIds.put(2, "Memory potion");
        potionsIds.put(3, "Levitation potion");
        potionsIds.put(4, "Invisibility potion");

        getKeys(potionsIds);

        HashMap<Integer, String> studentNames = new HashMap<>();
        studentNames.put(1, "Jo");
        studentNames.put(2, "Ron");
        studentNames.put(3, "Harry");
        studentNames.put(5, "Hermione");
        studentNames.put(6, "Neville");
        studentNames.put(7, "Ginny");
        studentNames.put(8, "Luna");

        System.out.println(checkLineLongerThanThree(studentNames));

    }

    public static void getKeys(HashMap<Integer, String> map) {
        TreeSet<Integer> keys = new TreeSet<>();

        for(Map.Entry<Integer, String> entry : map.entrySet()) {

           keys.add(entry.getKey());

        }
        System.out.println(keys);
    }

    public static TreeMap<Integer,String> checkLineLongerThanThree(HashMap<Integer, String>map) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().length() > 3) {
                map1.put(entry.getKey(), entry.getValue());
            }
        } return map1;
    }
}