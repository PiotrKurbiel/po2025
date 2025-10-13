import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        ArrayList liczby = new ArrayList(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int losowa = random.nextInt(1,51);
            if(liczby.contains(losowa)){
                i--;
                continue;
            }
            liczby.add(losowa);

        }
        System.out.println("Liczby wylosowane przez system: " + liczby);
        System.out.println("Liczby wybrane przez ciebie: " + Arrays.asList(args));
        int hit = 0;
        for(int i = 0; i < 6; i++){
            if(liczby.contains(Integer.parseInt(args[i]))){
                hit++;
            }
        }
        System.out.println("Trafiłeś " + hit + " liczb");
        System.out.println();

    }
}
