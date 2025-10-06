import java.util.ArrayList;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        ArrayList liczby = new ArrayList(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int losowa = random.nextInt(0,51);
            if(liczby.contains(losowa)){
                i--;
                continue;
            }
            liczby.add(losowa);

        }

        System.out.println(liczby);

    }
}
