package zadania;
import animals.*;



public class Zoo {
    Animal[] animals = new Animal[100];

    void wylosuj() {
        for (int i = 0; i < animals.length; i++) {
            int wybor = (int) (Math.random() * 3) + 1;
            if (wybor == 1) {
                animals[i] = new Parrot("Krzysztof", 2);
            }
            else if(wybor == 2) {
                animals[i] = new Dog("Adam", 4);
            }
            else if (wybor == 3) {
                animals[i] = new Snake("Marcin", 0);
            }
        }
    }

    void wypisz() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name);
            String opis = animals[i].getDescription();
            System.out.println(opis);
        }
    }
    void policz(){
        int liczba = 0;
        for(int i = 0; i < animals.length; i++){
            liczba += animals[i].getLegs();
        }
        System.out.println(liczba);
    }

    static void main() {
        Zoo zoo = new Zoo();
        zoo.wylosuj();
        zoo.wypisz();
        zoo.policz();
    }
}

