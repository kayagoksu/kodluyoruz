import java.util.Scanner;

public class Yildizlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        // üçgen
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //elmas
        for (int i = number-1; i>=0; i--) {
            for (int j = number - i-1; j >=0; j--) {
                System.out.print(" ");
            }
            for(int k = (2*i+1); k>=1;k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

