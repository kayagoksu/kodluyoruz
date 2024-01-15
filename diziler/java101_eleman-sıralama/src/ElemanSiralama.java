import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list = new int[n];
        int index = 0;
        int number;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Elemanı : ");
            number = input.nextInt();
            list[index++] = number;
        }

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));


    }

}

