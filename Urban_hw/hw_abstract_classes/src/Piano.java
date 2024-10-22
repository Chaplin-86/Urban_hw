public class Piano extends Instrument {
    @Override
    public String play() {
        return "Звучит фортепиано";
    }

    @Override
    public String tune(String note) {
        if(note.equals("Чистая нота")) {
            return "Фортепиано настроено";
        } else {
            return "Фортепиано расстроено";
        }
    }
}
