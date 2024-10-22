public class Eagle extends Bird {
    public Eagle(int flySpeed) {
        super(flySpeed);
    }


    @Override
    public void fly() {
        if(flySpeed >= 190 && flySpeed <= 240) {
            System.out.println("Орёл летит");
        } else if (flySpeed >= 241 && flySpeed <= 320) {
            System.out.println("Орёл пикирует вниз");
        } else {
            System.out.println("Орёл парит");
        }

    }

    @Override
    public void makeSound() {
        System.out.println("Орлиный крик");

    }
}
