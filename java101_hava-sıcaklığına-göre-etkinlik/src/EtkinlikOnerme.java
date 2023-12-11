import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık bilgisini giriniz : ");
        temp = input.nextInt();

        /*if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp <= 25) {
            if (temp <= 15) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            if (temp >= 10) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilrisiniz.");
        }*/

        // Alternatif
        if(temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temp <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (temp < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilrisiniz.");
        }

    }
}

