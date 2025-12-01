package symulator;

public class SkrzyniaBiegów extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;
    Sprzęgło sprzeglo;
    public void zwiększBieg(){
        if((sprzeglo.stanSprzęgła) == true){
            if(aktualnyBieg < iloscBiegow){
                aktualnyBieg++;
            }
            else{
                System.out.println("Nie można zwiększyć biegu (Bieg maksymalny)");
            }
        }
        if(sprzeglo.stanSprzęgła == false){
            System.out.println("PALISZ SPRZĘGŁO");
        }
    }
    public void zmniejszBieg(){
        if((sprzeglo.stanSprzęgła) == true){
            if (aktualnyBieg > 1) {
                aktualnyBieg--;
            } else {
                System.out.println("Nie można zmniejszyć biegu (Bieg minimalny)");
            }
        }
        if((sprzeglo.stanSprzęgła) == false){
            System.out.println("PALISZ SPRZEGLO");
        }
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public SkrzyniaBiegów(String producent, String model, int rocznik, String nazwa, int waga, int cena, int iloscBiegow, Sprzęgło sprzeglo) {
        super(producent, model, rocznik, nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
    }
}
