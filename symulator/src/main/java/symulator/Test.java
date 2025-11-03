package symulator;

public class Test {
        public static void main() {
            Sprzęgło sprzęgło1 = new Sprzęgło("Fiat", "125p", 1980,"sprzęgło", 30, 20);
            SkrzyniaBiegów skrzynia1 = new SkrzyniaBiegów("Opel", "Astra", 2003, "skrzynia",300, 1200, 5, sprzęgło1);
            Silnik silnik1 = new Silnik("Volkswagen", "Passat", 2001, "silnik", 500, 4000, 9000);

            Samochód auto = new Samochód(skrzynia1, silnik1);
            auto.włącz();

            auto.skrzynia.zwiększBieg();




        }

}
