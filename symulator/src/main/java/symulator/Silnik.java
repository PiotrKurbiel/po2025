package symulator;

public class Silnik extends Komponent {
    int maxObroty;
    int obroty;
    void uruchom(){
        obroty = 900;
    }
    void zatrzymaj(){
        obroty = 0;
    }
    void zwiększObroty(){
        if(obroty+500 < maxObroty) {
            obroty += 500;
        }
    }
    void zmniejszObroty(){
        if(obroty-500 > 900){
            obroty -= 500;
        }
    }

    public Silnik(String producent, String model, int rocznik, String nazwa, int waga, int cena, int maxObroty) {
        super(producent, model, rocznik, nazwa, waga, cena);
        this.maxObroty = maxObroty;
    }
}
