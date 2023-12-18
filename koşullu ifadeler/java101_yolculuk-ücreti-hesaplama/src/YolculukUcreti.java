import java.util.Scanner;
public class YolculukUcreti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (yas > 0 && mesafe > 0) {
            double kmUcreti = 0.10;
            double normalTutar = mesafe * kmUcreti;

            double yasIndirimi = 0.0;
            double gidisDonusIndirimi = 0.0;
            double indirimliTutar = 0.0;
            double toplamTutar = 0.0;

            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = normalTutar * 0.30;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                gidisDonusIndirimi = indirimliTutar * 0.20;
                indirimliTutar -= gidisDonusIndirimi;
                toplamTutar = indirimliTutar * 2;
                System.out.println("Toplam Tutar = " + toplamTutar + " TL");
            } else if (yolculukTipi == 1) {
                toplamTutar = indirimliTutar;
                System.out.println("Toplam Tutar = " + toplamTutar + " TL");
            } else {
                System.out.println("Hatalı Veri Girdiniz!");
            }

        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}

