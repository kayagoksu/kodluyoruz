import java.util.Scanner;

public class DeseneGoreMetot {

    static void fun1(int n, int m) {
        System.out.print(m + " ");
        if (m > 0) {
            fun1(n, m - 5);
        } else {
            fun2(n, m + 5);
            return;
        }

    }

    static void fun2(int n, int m) {
        if (m > n) {
            return;
        } else {
            System.out.print(m + " ");
            fun2(n, m + 5);
        }
    }

    // alternatif
    /*static void fun(int n) {
        System.out.print(n + " ");
        if(n <= 0) {
            return;
        }
        fun(n - 5);

        if(n > 0) {
            System.out.print(n + " ");
        }
    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = input.nextInt();
        int m;
        fun1(number, m = number);
//        fun(number);
        System.out.println();
    }
}

