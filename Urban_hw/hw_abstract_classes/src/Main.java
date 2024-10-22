public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();

        String guitarPlay = guitar.play();
        System.out.println(guitarPlay);

        String guitarTune = guitar.tune("Чистая нота");
        System.out.println(guitarTune);

        System.out.println("_______________________________");

        Piano piano = new Piano();

        String pianoPlay = piano.play();
        System.out.println(pianoPlay);

        String pianoTune = piano.tune("Фальшивая нота");
        System.out.println(pianoTune);

        Eagle eagle = new Eagle(200);
        eagle.fly();
        eagle.makeSound();

        System.out.println("____________________________");
        Hawk hawk = new Hawk(190);
        hawk.fly();
        hawk.makeSound();





    }
}