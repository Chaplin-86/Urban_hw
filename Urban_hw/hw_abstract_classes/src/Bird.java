public abstract class Bird {
    /**
     *  Напишите программу для создания абстрактного класса Bird с абстрактными методами fly() и makeSound().
     *  У класса Bird имеется поле, характеризующее скорость полета flySpeed. У класса Bird есть конструктор.
     *  Создайте подклассы Eagle и Hawk, расширяющие класс Bird, и реализуйте соответствующие методы для описания того,
     *  как каждая птица летает и издает звуки.
     */

    int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();
    public abstract void makeSound();


}
