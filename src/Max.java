import java.util.Arrays;

/**
 * Created by opilane on 16.11.2016.
 */
// otsib massiivist suurima arvu : cmd>>>java Max  1 2 22 69 88 11
public class Max {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int max = Integer.MIN_VALUE;

        System.out.println(max);

         for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;

            }
        }System.out.print(max);
    }

}
