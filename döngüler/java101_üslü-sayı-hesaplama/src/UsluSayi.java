import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n, k, result = 1, result2 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        // while döngüsü
        int i = 1;
        while (i <= k) {
            result *= n;
            i++;
        }

        System.out.println("Sonuç (while döngüsü) : " + result);

        // for döngüsü
        for (int j = 1; j <= k; j++) {
            result2 *= n;
        }

        System.out.println("Sonuç (for döngüsü) : " + result2);

    }
}

