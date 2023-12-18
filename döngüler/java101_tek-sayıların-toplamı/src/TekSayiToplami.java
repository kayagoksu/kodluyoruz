import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        int number, OddSum = 0, EvenSum = 0;

        Scanner input = new Scanner(System.in);


        /*do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();

            if (number % 2 == 1) {
                OddSum += number;
            }

        } while (number > 0);

        System.out.println("Tek Sayıların Toplamı : " + OddSum);*/

        do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();

            if (number % 4 == 0) {
                EvenSum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Çift ve 4'e Bölünebilen Sayıların Toplamı : " + EvenSum);

    }
}

