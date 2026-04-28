public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;
    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }
    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }
    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }
    @Override
    public double obliczKosztMiesieczny() {
        if (czyAutomatyzujacy) {
            return getStawkaBazowa() + 2000;
        }
        return getStawkaBazowa();
    }
    @Override
    public String przedstawSie() {
        if (czyAutomatyzujacy) {
            return "Tester automatyzujacy: " + getImie();
        }
        return "Tester manualny: " + getImie();
    }
    public void uruchomRaportTestow() {
        System.out.println("Uruchomiono scenariuszy: " + liczbaScenariuszy);
    }
}