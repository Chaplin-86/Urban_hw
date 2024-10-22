public class Fish implements Swimmable, Flyable {
    String name;
    String family;
    int age;

    public Fish(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плывёт");

    }

    @Override
    public void fly() {
        if(family.equals("Летучие рыбы")){
            System.out.println("Рыбы семейства Летучие рыбы умеют летать");
        } else {
            System.out.println("Рыбы не летают");
        }

    }
}
