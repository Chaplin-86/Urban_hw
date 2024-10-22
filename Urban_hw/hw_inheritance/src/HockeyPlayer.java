public class HockeyPlayer extends Sportsman {
    /**
     * Создать класс-наследник HockeyPlayer.
     * В нём написать свой дополнительный (относящийся к этому классу) метод,
     * например, у класса Footballer может быть метод scoringGoals,
     * характеризующий результативную игру забиванием голов, у других классов методы будут свои.
     */
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    public void score(boolean isScored) {
        if(isScored) {
            System.out.println("Нету равных нам в хоккее! Лучше всех играть умеем!");
        } else {
            System.out.println("Шайбу! Шайбу!");
        }
    }

}
