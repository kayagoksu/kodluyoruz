import java.util.Scanner;

public class FibonacciSequence {

    static int fibonacci(int number) {
        
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz : ");
        int num = input.nextInt();

        System.out.println("Sonuç : " + fibonacci(num));


    }
}

