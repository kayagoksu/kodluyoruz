import java.util.Scanner;

public class AsalSayiBulma {

    static int asalSayi(int number, int i, int count) {
        if (i == number+1) {
            return count;
        }
        if (number % i == 0) {
            count++;
        }
        return asalSayi(number, i+1, count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int count = 0, i = 1;
        int result = asalSayi(number, i, count);

        if (result > 2) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            System.out.println(number + " sayısı ASALDIR !");
        }

    }
}

