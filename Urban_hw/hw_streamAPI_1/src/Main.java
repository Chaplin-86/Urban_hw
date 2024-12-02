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

//        Stream<String> animalStream = Stream.of("bear", "bird", "crocodile", "dolphin", "elephant", "frog", "giraffe", "gorilla", "hamster", "hedgehog");
//        animalStream.takeWhile().
//                forEach(System.out::println);

        //Task 2

        Stream<Person> people = Stream.of(
                new Person("Bilbo Baggins", 131),
                new Person("Frodo Baggins",50),
                new Person("Peregrin Took", 29),
                new Person("Meriadoc Brandybuck", 37),
                new Person("Samwise Gamgee", 39),
                new Person("Boromir", 41),
                new Person("Aragorn", 88),
                new Person("Gimli", 140),
                new Person("Legolas", 500),
                new Person ("Gandalf the Grey", 4000)
        );
        people
                .filter(age -> (age.getAge() > 30))
                .map(person -> person.getName() + " " + person.getAge())
                .forEach(System.out::println);
    }
}