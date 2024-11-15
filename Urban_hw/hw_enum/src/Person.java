import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;

    Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    enum Gender {
        MALE("Мужчина"),
        FEMALE("Женщина");
        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }


        public String getGender() {
            return gender;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender'" + gender.getGender() + '\'' +
                '}';
    }


    }




