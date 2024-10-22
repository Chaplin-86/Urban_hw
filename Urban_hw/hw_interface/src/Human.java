public class Human implements Swimmable, Flyable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " начал заплыв");
    }

    @Override
    public void fly() {
        System.out.println(name + " летит на дельтаплане");

    }
}
