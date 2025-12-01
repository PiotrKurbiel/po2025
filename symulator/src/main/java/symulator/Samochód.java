package symulator;

public class Samochód {
    public Silnik silnik;
    public SkrzyniaBiegów skrzynia;
    public Pozycja pozycja;
    public String model;
    public String nrrej;
    public int waga;
    public int predkosc;
    public void włącz(){
        silnik.uruchom();
    }
    public void wyłącz(){
        silnik.zatrzymaj();
    }

    public Samochód(SkrzyniaBiegów skrzynia, Silnik silnik, Pozycja pozycja, String model, String nrrej, int waga, int predkosc){
        this.skrzynia = skrzynia;
        this.silnik = silnik;
        this.pozycja = pozycja;
        this.model = model;
        this.nrrej = nrrej;
        this.waga = waga;
        this.predkosc = predkosc;
    }
}
