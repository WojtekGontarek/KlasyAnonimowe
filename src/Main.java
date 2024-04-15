import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> uczniowie = new ArrayList<>();

        uczniowie.add("Pawel");
        uczniowie.add("Maks");
        uczniowie.add("Tymon");
        uczniowie.add("Łysy");
        uczniowie.add("Wojtek");
        uczniowie.add("Monika");
        uczniowie.add("krystian");
        uczniowie.add("Kajetan");
        uczniowie.add("Michał");
        uczniowie.add("Roch");

        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });
//        System.out.println(uczniowie);
        Druzyna druzyna1 = new Druzyna("slask");
        Druzyna druzyna2 = new Druzyna("legia");
        Druzyna druzyna3 = new Druzyna("kielce");

        ArrayList<Druzyna> druzyny = new ArrayList<>();
        druzyny.add(druzyna1);
        druzyny.add(druzyna2);
        druzyny.add(druzyna3);

        Mecz mecz1 = new Mecz(druzyna1,druzyna2, 1,0);
        Mecz mecz2 = new Mecz(druzyna1,druzyna3, 2,1);
        Mecz mecz3 = new Mecz(druzyna3,druzyna2, 3,3);
        Mecz mecz4 = new Mecz(druzyna2,druzyna1, 0,1);
        Mecz mecz5 = new Mecz(druzyna3,druzyna1, 1,2);
        Mecz mecz6 = new Mecz(druzyna2,druzyna3, 3,3);

        
        

    }
}