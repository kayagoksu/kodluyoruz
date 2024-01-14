import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        int min = dizi[0];
        int max = dizi[0];

        for (int i : dizi) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Dizinin minimum eleman değeri : " + min);
        System.out.println("Dizinin maksimum eleman değeri : " + max);

        System.out.println("Dizi : " + Arrays.toString(dizi));

        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        HelperArray.findNearest(dizi, number);


    }

}

