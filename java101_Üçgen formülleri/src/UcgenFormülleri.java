import java.util.Scanner;

public class UcgenFormülleri {
    public static void main(String[] args) {

        //dik kenarları uzunluğu kullanıcı tarafından verilen dik üçgenin hipotenüs uzunluğu

        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Dik üçgenin a kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("Dik üçgenin b kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Dik üçgenin hipotenüs uzunluğu: " + c);

        // üç kenar uzunluğu kullanıcı tarafından verilen üçgenin alanı
        double x, y ,z, cevre, alan, u;
        System.out.println("Yeni üçgen için 3 kenar uzunluğu giriniz.");
        System.out.print("1. kenar uzunluğu: ");
        x = input.nextDouble();
        System.out.print("2. kenar uzunluğu: ");
        y = input.nextDouble();
        System.out.print("3. kenar uzunluğu: ");
        z = input.nextDouble();

        cevre = x+y+z;
        u = cevre/2;
        alan = Math.sqrt(u*(u-x)*(u-y)*(u-z));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);

    }
}

