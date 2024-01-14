import java.util.Arrays;

public class HelperArray {
    static void findNearest(int[] arr, int num) {
        Arrays.sort(arr);
        int small = arr[0];
        int smallRange = Math.abs(num - arr[0]);
        int big = arr[0];
        int bigRange = Math.abs(arr[0] - num);

        for (int i : arr) {
            if (i < num && (Math.abs(num - i) < smallRange)) {
                smallRange = Math.abs(num - i);
                small = i;
            } else if (i > num && (Math.abs(i-num) < bigRange)) {
                bigRange = Math.abs(i - num);
                big = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + small);
        System.out.println("Girilen sayıdan büyük  en yakın sayı : " + big);

    }

}
