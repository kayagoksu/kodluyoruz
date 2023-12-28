import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz : ");
        int n = input.nextInt();

        int result, temp = 0, temp2 = 1;
        for (int i = 0; i <= n; i++) {

            System.out.print(temp + " ");

            result = temp + temp2;
            temp = temp2;
            temp2 = result;
        }

        System.out.println("\n");

    }
}

