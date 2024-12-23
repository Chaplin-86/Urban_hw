import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Создайте список типа String, например, названия пищевых продуктов.
         * Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы,
         * с использованием потоков.
         * 2. Создать класс Person с полями name и age. В классе с методом main создать список,
         * состоящий не менее, чем из 10 объектов класса Person с произвольными данными.
         * Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.
         */

        //Task 1
        List<String>animals = new ArrayList<>();
        animals.add("bear");
        animals.add("bird");
        animals.add("crocodile");
        animals.add("dolphin");
        animals.add("elephant");
        animals.add("frog");
        animals.add("giraffe");
        animals.add("gorilla");
        animals.add("hamster");
        animals.add("hedgehog");

        int result = (int) animals.stream().filter(s -> s.startsWith("h")).count();
        System.out.println(result);

        System.out.println("_________________________");

        //Task 2
        List<Person>fellowship = new ArrayList<>();
        fellowship.add(new Person("Bilbo Baggins", 131));
        fellowship.add(new Person("Frodo Baggins", 50));
        fellowship.add(new Person("Peregrin Took", 29));
        fellowship.add(new Person("Meriadoc Brandybuck", 37));
        fellowship.add(new Person("Samwise Gamgee", 39));
        fellowship.add(new Person("Boromir", 41));
        fellowship.add(new Person("Aragorn", 88));
        fellowship.add(new Person("Gimli", 140));
        fellowship.add(new Person("Legolas", 500));
        fellowship.add(new Person("Gandalf the Grey", 4000));

        fellowship.stream()
                .filter(age -> (age.getAge() > 30))
                .map(person -> person.getName() + " " + person.getAge())
                .forEach(System.out::println);
    }
}