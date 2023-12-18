import java.util.Scanner;

public class DaireFormülleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, a;
        double pi = 3.14, cevre, alan, dilimAlanı;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();


        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);

        System.out.print("Daire diliminin merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();

        dilimAlanı = (pi * (r * r) * a) / 360;

        System.out.println("Daire diliminin alanı: " + dilimAlanı);

    }
}

