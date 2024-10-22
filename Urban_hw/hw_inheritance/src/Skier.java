public class Skier extends Sportsman{
    /**
     * Создать класс-наследник Skier.
     * В нём написать свой дополнительный (относящийся к этому классу) метод,
     * например, у класса Footballer может быть метод scoringGoals,
     * характеризующий результативную игру забиванием голов, у других классов методы будут свои.
     */
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public void doSport() {
        System.out.println("Лыжник " + getName() + " начал гонку. Вперёд, чемпион!");
    }
}
