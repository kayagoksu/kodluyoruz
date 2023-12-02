import java.util.Scanner;

public class UcgenFormülleri {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Dik üçgenin a kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("Dik üçgenin b kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Dik üçgenin hipotenüs uzunluğu: " + c);


    }
}

