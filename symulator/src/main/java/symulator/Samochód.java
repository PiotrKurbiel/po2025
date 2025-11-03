package symulator;

public class Samochód {
    Silnik silnik;
    SkrzyniaBiegów skrzynia;
    void włącz(){
        silnik.uruchom();
    }
    void wyłącz(){
        silnik.zatrzymaj();
    }

    public Samochód(SkrzyniaBiegów skrzynia, Silnik silnik){
        this.skrzynia = skrzynia;
        this.silnik = silnik;
    }
}
