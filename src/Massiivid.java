/**
 * Created by opilane on 16.11.2016.
 */
public class Massiivid {


    public static void main(String[] args) {

        int size = 6;
        int[] massiiv1 = {10, 100, 1000, 10000, 100000, 1000000};//new int[size];
        int ans=search(massiiv1,10000);
        //

        for (int i = massiiv1.length - 1; i >= 0; i--) {

            System.out.println(massiiv1[i]);
        }
        //for each type loop
        for (int kaup : massiiv1) {
            int m = kaup / 10;

            System.out.println(m);
            System.out.println(ans);


        }
        //ainult kolmas massiivist
        System.out.println(massiiv1[3]);}

    public static int search(int[] massiiv1, int target) {
        for (int i = 0; i < massiiv1.length; i++) {
            if (massiiv1[i] == target) {
                return i;
            }
        }return -1;

    }
}
