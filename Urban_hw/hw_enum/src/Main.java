import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Необходимо написать метод, который возвращает позицию буквы алфавита.
         * Для реализации программы создать enum алфавита.
         *
         * 2. Написать класс Person с полями имени(name), возраста(age).
         * Для определения пола Person создать enum Gender с соответствующими константами.
         * В классе с методом main создать список объектов Person, состоящий не менее, чем из 10 человек разного пола.
         * Написать метод, возвращающий список объектов класса Person в зависимости от введенного параметра пола,
         * т.е. список мужчин или женщин.
         */

        //Task 1

        System.out.println(letterPosition(Alphabet.А));

        //Task2

        List<Person> dumbledoreArmy = new ArrayList<>();
        dumbledoreArmy.add(new Person("Harry", 16, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Ron", 16, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Hermione", 16, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Neville", 16, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Ginny", 15, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Luna", 16, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Fred", 18, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("George", 18, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Din", 16, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Seamus", 16, Person.Gender.MALE));
        dumbledoreArmy.add(new Person("Parvati", 16, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Padma", 16, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Lavender", 16, Person.Gender.FEMALE));
        dumbledoreArmy.add(new Person("Cho", 15, Person.Gender.FEMALE));

        sortByGender(dumbledoreArmy, Person.Gender.MALE);
    }

    public static int letterPosition(Alphabet alphabet) {
        return alphabet.ordinal();

    }

    public static void sortByGender(List<Person> people, Person.Gender gender) {

//        Person.Gender female = Person.Gender.FEMALE;
//        Person.Gender male = Person.Gender.MALE;
//        List<Person> men = new ArrayList<>();
//        List<Person> women = new ArrayList<>();

        for (int i = 0; i < people.size(); i++) {

            if (people.get(i).gender.equals(gender)) {
                System.out.println(people.get(i));
            }
        }
    }


}


