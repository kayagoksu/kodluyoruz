import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalindrome(int number) {
        int temp = number, lastNumber, reversedNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reversedNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num = input.nextInt();

        boolean result = isPalindrome(num);

        if(result) {
        System.out.println(num+" sayısı bir palindrom sayıdır.");
        } else {
            System.out.println(num+" sayısı bir palindrom sayı değildir.");
        }

    }
}

