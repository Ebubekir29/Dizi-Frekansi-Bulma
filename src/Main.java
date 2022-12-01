import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20,20, 10, 10, 20, 5, 20};
        List<Integer> frekans = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    counter++;
                }
            }
            if(!(frekans.contains(dizi[i]))  ) {
                frekans.add(dizi[i]);
                System.out.println(dizi[i] + " sayisi " + counter + " kere tekrar edildi.");
            }
            counter = 0;
        }

    }
}