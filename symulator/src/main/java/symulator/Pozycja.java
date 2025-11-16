package symulator;

public class Pozycja {
    double x;
    double y;
    void aktualizujPozycje(double deltaX, double deltaY){
        x += deltaX;
        y += deltaY;
    }
    String getPozycja(){
        String pozycja = "Pozycja wynosi X: " + x + "Y: " + y;
        return pozycja;
    }
    public Pozycja(){
        this.x = 0;
        this.y = 0;
    }
}
