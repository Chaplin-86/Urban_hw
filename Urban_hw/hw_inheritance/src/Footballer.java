public class Footballer extends Sportsman{
    /**
     * Создать класс-наследник Footballer.
     * В нём написать свой дополнительный (относящийся к этому классу) метод, например, метод scoringGoals,
     * характеризующий результативную игру забиванием голов.
     */

    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void score(boolean isScored) {
        if(isScored) {
            System.out.println("Гооол!!!");
        } else {
            System.out.println("Ууууу! Мазила!");
        }
    }

}
