//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * В классе с методом main создать экземпляры классов – наследников, по 2 на каждый класс.
         * Вывести информацию о каждом экземпляре класса и действие всех имеющихся методов.
         */

        Footballer footballer = new Footballer("Криштиану Роналду", "Ан-Наср", 39);
        Footballer footballer1 = new Footballer("Веллитон", "Спартак", 37);

        System.out.println("Футболист " + footballer.getName()
                + " из команды " + footballer.getTeam()
                + " возрастом " + footballer.getAge() + " лет");
        footballer.doSport();
        footballer.score(false);

        System.out.println("Футболист " + footballer1.getName()
                + " из команды " + footballer1.getTeam()
                + " возрастом " + footballer1.getAge() + " лет");
        footballer1.doSport();
        footballer1.score(true);

        HockeyPlayer hockeyPlayer = new HockeyPlayer("Александр Овечкин", "Вашингтон Кэпиталз", 39);
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Евгений Малкин", "Питтсбург Пингвинз", 38);

        System.out.println("Хоккеист " + hockeyPlayer.getName()
                + " из команды " + hockeyPlayer.getTeam()
                + " возрастом " + hockeyPlayer.getAge() + " лет");
        hockeyPlayer.doSport();
        hockeyPlayer.score(true);

        System.out.println("Хоккеист " + hockeyPlayer1.getName()
                + " из команды " + hockeyPlayer1.getTeam()
                + " возрастом " + hockeyPlayer1.getAge() + " лет");
        hockeyPlayer1.doSport();
        hockeyPlayer1.score(false);

        Skier skier = new Skier("Сергей Устюгов", "Россия", 32);
        Skier skier1 = new Skier("Никита Крюков", "Россия", 39);

        System.out.println("Лыжник " + skier.getName()
                + " из команды " + skier.getTeam()
                + " возрастом " + skier.getAge() + " лет");
        skier.doSport();

        System.out.println("Лыжник " + skier1.getName()
                + " из команды " + skier1.getTeam()
                + " возрастом " + skier1.getAge() + " лет");
        skier1.doSport();




    }
}