public class Sportsman {
    /**
    * Создать класс Sportsman с полями строкового типа name, team, поле age – целое число,
     * все поля отмечены модификатором private.
    * Создать конструктор класса и методы get для доступа к полям класса.
    * В классе есть метод, описывающий общее действие спортсмена.
    */

    private String name;
    private String team;
    private int age;


    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public void doSport() {
        System.out.println("Поехали!");
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }
}
