public class  Guitar extends Instrument {


    @Override
    public String play() {
        return "Звучит гитара";
    }

    @Override
    public String tune(String note) {
        if(note.equals("Чистая нота")) {
            return "Гитара настроена";
        } else {
        return "Гитара расстроена";
        }
    }
}
