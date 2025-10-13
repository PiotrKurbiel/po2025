import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Liczby wybrane przez ciebie: " + Arrays.asList(args));
        int hit = 0;
        int ilosclos = 0;
        long czasprzed = System.currentTimeMillis();
        while(hit != 6) {
            hit = 0;
            ArrayList liczby = new ArrayList(6);
            for (int i = 0; i < 6; i++) {
                int losowa = random.nextInt(1, 51);
                if (liczby.contains(losowa)) {
                    i--;
                    continue;
                }
                liczby.add(losowa);

            }
            //System.out.println("Liczby wylosowane przez system: " + liczby);

            for (int i = 0; i < 6; i++) {
                if (liczby.contains(Integer.parseInt(args[i]))) {
                    hit++;
                }
            }
            //System.out.println("Trafiłeś " + hit + " liczb");
            //System.out.println();
            ilosclos++;
        }
        long czaspo = System.currentTimeMillis();
        System.out.println("Ilosc losowan do trafienia " + ilosclos);
        System.out.println("Czas do trafienia w sekundach " + (czaspo - czasprzed)/1000.0);

    }
}
