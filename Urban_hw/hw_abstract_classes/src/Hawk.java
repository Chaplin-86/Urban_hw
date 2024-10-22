public class Hawk extends Bird {
    public Hawk(int flySpeed) {
        super(flySpeed);
    }


    @Override
    public void fly() {
        if(flySpeed >= 32 && flySpeed <= 60) {
            System.out.println("Ястреб летит");
        } else if (flySpeed >= 61 && flySpeed <= 190) {
            System.out.println("Ястреб пикирует вниз");
        } else {
            System.out.println("Ястреб парит");
        }

    }

    @Override
    public void makeSound() {
        System.out.println("Крик ястреба");

    }
}
