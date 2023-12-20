import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyel Sayısı : ");
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Faktöriyel sonucu : " + result);

        // Kombinasyon C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Küme eleman sayısı : ");
        int n = input.nextInt();
        System.out.print("Kombinasyon sayısı : ");
        int r = input.nextInt();
        int fark = n - r;
        int nFak = 1, rFak = 1, farkFak = 1;

        for (int i = 1; i <= n; i++) {
            nFak *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFak *= i;
        }

        for (int i = 1; i <= fark; i++) {
            farkFak *= i;
        }

        int comb = nFak / (rFak * farkFak);

        System.out.println("Kombinasyon sonucu : " + comb);

    }
}

