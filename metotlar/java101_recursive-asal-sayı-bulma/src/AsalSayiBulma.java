import java.util.Scanner;

public class AsalSayiBulma {

    static boolean asalSayi(int number, int i) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else if (i > number / 2) {
            return true;
        } else {
            return asalSayi(number, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int i = 2;

        if (asalSayi(number, i)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }


    }
}

