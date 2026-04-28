import java.util.ArrayList;
public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;
    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }
    public void dodajPracownika(Pracownik p) {
        pracownicy.add(p);
    }
    public void wypiszSkladZespolu() {
        System.out.println("Zespol: " + nazwaProjektu);
        for (Pracownik p : pracownicy) {
            System.out.println(p.toString());
        }
    }
    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma = suma + p.obliczKosztMiesieczny();
        }
        return suma;
    }
    public Pracownik znajdzPoId(String id) {
        for (Pracownik p : pracownicy) {
            if (p.pobierzIdPracownika().equals(id)) {
                return p;
            }
        }
        return null;
    }
}