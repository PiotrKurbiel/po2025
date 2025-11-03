package symulator;

public class Sprzęgło extends Komponent{
    boolean stanSprzęgła;
    void wcisnij(){
        stanSprzęgła = true;
    }
    void zwolnij(){
        stanSprzęgła = false;
    }
    public Sprzęgło(String producent, String model, int rocznik, String nazwa, int waga, int cena){
        super(producent, model, rocznik, nazwa, waga, cena);
        this.stanSprzęgła = false;

    }
}
