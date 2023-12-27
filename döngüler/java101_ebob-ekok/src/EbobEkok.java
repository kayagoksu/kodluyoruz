import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, ebob = 1, ekok = 1;

        System.out.print("Birinci sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        /*// ebob for döngüsü
        for (int i = Math.min(number1, number2); i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
                break;
            }
        }*/

        /*// ebob for döngüsü 2. yöntem
        for(int k = 1; k<= Math.min(number1, number2); k++) {
            if (number1 % k == 0 && number2 % k == 0) {
                ebob = k;
            }
        }*/

        // ebob while döngüsü
        int i = Math.min(number1, number2);
        while (i > 0) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        System.out.println("EBOB : " + ebob);

        /* ekok for döngüsü
        int n1 = Math.max(number1, number2);
        int n2 = Math.min(number1, number2);

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n1; j++) {
                if (n1 * i == n2 * j) {
                    ekok = n2 * j;
                    break;
                }
            }
            if (ekok != 1) {
                break;
            }
        }*/

        /*// ekok for döngüsü 2. yöntem
        for (int l = 1; l <= (number1 * number2); l++) {
            if (l % number1 == 0 && l % number2 == 0) {
                ekok = l;
                break;
            }
        }*/

        int m = 1;
        while (m <= (number1 * number2)) {
            if (m % number1 == 0 && m % number2 == 0) {
                ekok = m;
                break;
            }
            m++;
        }

        System.out.println("EKOK : " + ekok);

    }
}

