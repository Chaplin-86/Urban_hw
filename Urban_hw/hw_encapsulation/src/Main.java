//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("Harry Potter", true);
        Gamer gamer2 = new Gamer("Hermione Granger", true);
        Gamer gamer3 = new Gamer("Ron Weasley", true);
        Gamer gamer4 = new Gamer("Draco Malfoy", false);
        Gamer gamer5 = new Gamer("Lord Voldemort", false);

        Gamer[] gamers = {gamer1, gamer2, gamer3, gamer4, gamer5};
        for(Gamer item : gamers) {
            if(item.isActive() == true) {
                System.out.println(item);
            }
        }




    }
}