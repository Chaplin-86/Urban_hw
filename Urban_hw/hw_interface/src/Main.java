//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Создать классы Human, Fish, Bird с полями имени, возраста (можно добавить любые поля по своему усмотрению).
         * Создать интерфейс Swimmable с методом, описывающим возможность плавать – swim.
         * Созданные выше классы должны наследоваться от этого интерфейса, реализация метода у каждого класса будет своя,
         * например, у человека – умеет плавать техникой брасс.
         * Создать интерфейс Flyable с методом fly. Наследовать от этого интерфейса те классы,
         * которые могут в той или иной мере выполнять полет.
         * В классе с методом main создать экземпляры классов Human, Fish, Bird,
         * вызвать у этих экземпляров имеющиеся методы
         */

        Human human = new Human("Иван", 25);
        human.swim();
        human.fly();

        System.out.println("__________________________");

        Fish fish = new Fish("Малая летучка", "Летучие рыбы", 1);
        Fish fish1 = new Fish("Акула", "Хрящевые рыбы", 13);
        fish.swim();
        fish.fly();
        fish1.swim();
        fish1.fly();

        System.out.println("___________________________");

        Bird bird = new Bird("Утка", "Водоплавающие птицы", 2);
        Bird bird1 = new Bird("Ласточка", "Ласточковые", 3);

        bird.swim();
        bird.fly();
        bird1.swim();
        bird1.fly();



    }
}