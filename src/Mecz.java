public class Mecz {
    private Druzyna druzyna1;
    private Druzyna druzyna2;
    private int wynik1;
    private int wynik2;

    public Mecz(Druzyna druzyna2, Druzyna druzyna1, int wynik1, int wynik2) {
        this.druzyna2 = druzyna2;
        this.druzyna1 = druzyna1;
        this.wynik1 = wynik1;
        this.wynik2 = wynik2;
    }


    public int getWynik1() {
        return wynik1;
    }
    public int getWynik2() {
        return wynik2;
    }

    public void setWynik1(int wynik1) {
        this.wynik1 = wynik1;
    }
    public void setWynik2(int wynik2) {
        this.wynik2 = wynik2;
    }

    @Override
    public String toString() {
        return String.format("%s-%s | %d-%d", druzyna1, druzyna2, wynik1, wynik2);
    }
}
