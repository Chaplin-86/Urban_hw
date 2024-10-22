public class Bird implements Swimmable, Flyable{
    String name;
    String family;
    int age;

    public Bird(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    @Override
    public void swim() {
        if(family.equals("Водоплавающие птицы")) {
            System.out.println("Водоплавающие птицы умеют плавать");
        } else {
            System.out.println("Большинство птиц не плавают");
        }

    }

    @Override
    public void fly() {
        System.out.println(name + " летит");

    }
}
