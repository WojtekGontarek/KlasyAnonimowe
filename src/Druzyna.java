import java.util.ArrayList;

public class Druzyna {
    private String nazwa;
    private int punkty;

    public Druzyna(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getNazwa() {
        return nazwa;
    }
    public String toString() {
        return nazwa;
    }
    ArrayList<Mecz> listaMeczow = new ArrayList<>();
    public void dodajMecz(Mecz mecz) {
        listaMeczow.add(mecz);
    }

    public int getPunkty() {
        return punkty;
    }



}
