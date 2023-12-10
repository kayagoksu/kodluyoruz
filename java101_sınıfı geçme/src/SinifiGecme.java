import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        double matematik, fizik, kimya, turkce, muzik, dersSayisi = 5, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100) {
            dersSayisi--;
        } else {
            toplam += matematik;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            dersSayisi--;
        } else {
            toplam += fizik;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            dersSayisi--;
        } else {
            toplam += kimya;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            dersSayisi--;
        } else {
            toplam += turkce;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            dersSayisi--;
        } else {
            toplam += muzik;
        }

        double ortalama = toplam / dersSayisi;


        System.out.println("Not Ortalamanız: " + ortalama);

        String sonuc = (ortalama >= 55.0) ? "Sınıfı Geçtiniz !" : "Sınıfta Kaldınız !";
        System.out.println(sonuc);
    }
}

