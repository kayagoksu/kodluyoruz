import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void addition() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı : ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);

    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı : ");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void division() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);

    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);

    }

    static void modulus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        System.out.print("Mod değeri giriniz : ");
        int mod = input.nextInt();
        int result = number % mod;
        System.out.println("Sonuç : " + result);
    }

    static void perimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz : ");
        int kisa = input.nextInt();
        System.out.print("Uzun kenarı giriniz : ");
        int uzun = input.nextInt();
        int cevre = 2 * (kisa + uzun);
        int alan = kisa * uzun;
        System.out.println("Dikdörtgenin çevresi : " + cevre);
        System.out.println("Dikdörtgenin alanı : " + alan);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    perimeter();
                    break;
                default:
                    break;
            }

        } while (select != 0);
        System.out.println("Çıkış yaptınız !");
    }
}

