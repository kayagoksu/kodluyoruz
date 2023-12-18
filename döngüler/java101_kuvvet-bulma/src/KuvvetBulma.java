import java.util.Scanner;
public class KuvvetBulma {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("2 için sınır sayısını giriniz : ");
        number = input.nextInt();

        for (int i =1;i<=number;i*=2){
            System.out.println(i);
        }

        System.out.print("4 için sınır sayısını giriniz : ");
        number = input.nextInt();

        for (int i =1;i<=number;i*=4){
            System.out.println(i);
        }

        System.out.print("5 için sınır sayısını giriniz : ");
        number = input.nextInt();

        for (int i =1;i<=number;i*=5){
            System.out.println(i);
        }

    }
}

