import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int mesafe;
        double taksimetre = 10, kmTutar = 2.20, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        toplamTutar = taksimetre + (kmTutar * mesafe);

        toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar;

        System.out.println("Toplam tutar = " + toplamTutar);


    }

}
