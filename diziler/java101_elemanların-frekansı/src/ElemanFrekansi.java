import java.util.Arrays;

public class ElemanFrekansi {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] freq = new int[array.length];
        int counted = -1;

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    freq[j] = counted;
                }
            }
            if (freq[i] != counted) {
                freq[i] = count;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları :");

        for (int i = 0; i < array.length; i++) {
            if (freq[i] != counted) {
                System.out.println(array[i] + " sayısı " + freq[i] + " kere tekrar edildi.");
            }
        }


    }

}

