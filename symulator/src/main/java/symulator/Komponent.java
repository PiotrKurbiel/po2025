package symulator;

public abstract class Komponent {
    String producent;
    String model;
    int rocznik;
    String nazwa;
    int waga;
    int cena;

    public String getProducent() {
        return producent;
    }

    public int getRocznik() {
        return rocznik;
    }
    public String getModel() {
        return model;
    }

    public Komponent() {
    }

    public Komponent(String producent, String model, int rocznik, String nazwa, int waga, int cena) {
        this.producent = producent;
        this.model = model;
        this.rocznik = rocznik;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }
}
