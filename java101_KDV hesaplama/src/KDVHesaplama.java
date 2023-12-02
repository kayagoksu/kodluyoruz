import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar, kdvliTutar, kdv = 0, kdvTutarı;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen tutarı giriniz: ");
        tutar = input.nextDouble();

        if (tutar > 0) {
            kdv = (tutar >= 0 && tutar < 1000) ? 0.18 : 0.08;

            kdvTutarı = tutar * kdv;
            kdvliTutar = tutar + kdvTutarı;


            System.out.println("KDV'siz fiyat = " + tutar);
            System.out.println("KDV oranı = " + kdv);
            System.out.println("KDV'li fiyat = " + kdvliTutar);
            System.out.println("KDV tutarı = " + kdvTutarı);

        } else {
            System.out.println("Geçersiz bir tutar girdiniz.");
        }

    }
}

