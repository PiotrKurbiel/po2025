package symulator;

public class Samochód {
    Silnik silnik;
    SkrzyniaBiegów skrzynia;
    Pozycja pozycja;
    void włącz(){
        silnik.uruchom();
    }
    void wyłącz(){
        silnik.zatrzymaj();
    }

    public Samochód(SkrzyniaBiegów skrzynia, Silnik silnik, Pozycja pozycja){
        this.skrzynia = skrzynia;
        this.silnik = silnik;
        this.pozycja = pozycja;
    }
}
