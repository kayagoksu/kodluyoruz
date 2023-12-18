import java.util.Scanner;

public class CiftsayiBulma {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        /*for (int i = 1; i <= sayi; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        int sum = 0, sayac = 0, ort = 0;

        if (sayi < 0) {
            System.out.println("Hatalı sayı girişi !");
        } else {
            for (int j = 0; j <= sayi; j++) {
                if (j % 3 == 0 && j % 4 == 0) {
                    sum += j;
                    sayac++;
                    System.out.println(j);
                }
            }

            ort = sum / sayac;

            System.out.println("Ortalama : " + ort);
        }
    }
}

