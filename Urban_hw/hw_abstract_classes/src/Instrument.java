public abstract class Instrument {
    /**
     * Напишите программу для создания абстрактного класса Instrument с абстрактными методами play() и tune().
     * Создайте подклассы для Guitar и Piano, которые расширяют класс Instrument
     * и реализуют соответствующие методы для игры и настройки каждого инструмента.
     */

    public abstract String play();

    public abstract String tune(String note);
}
