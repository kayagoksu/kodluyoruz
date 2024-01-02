import java.util.Scanner;

public class UsHesabi {

    static int us(int base, int pow) {
        int result = 1;
        if (pow == 0) {
            return 1;
        }
        while (pow > 0) {
            result *= base;
            pow--;
            us(base, pow);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int pow = input.nextInt();

        System.out.println("Sonuç : " + us(base, pow));


    }
}

