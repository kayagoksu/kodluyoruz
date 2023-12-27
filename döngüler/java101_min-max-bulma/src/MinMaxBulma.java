import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
         int n, number, min=0, max=0;

         Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        for(int i = 1; i<=n; i++) {
            System.out.print(i+". Sayıyı giriniz : ");
            number = input.nextInt();
            if (number<=min) {
                min = number;
            } else {
                max = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}

