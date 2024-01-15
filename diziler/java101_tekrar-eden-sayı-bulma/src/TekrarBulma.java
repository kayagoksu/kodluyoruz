import java.util.Arrays;

public class TekrarBulma {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};


        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));


        System.out.println("================");

        int[] list2 = {6, 8, 6, 3, 1, 4, 12, 6, 8, 5, 7, 4};
        int[] duplicate2 = new int[list2.length];

        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list2[i] % 2 == 0) {
                    if ((i != j) && list2[i] == list2[j]) {
                        if (!isFind(duplicate2, list2[i])) {
                            duplicate2[startIndex++] = list2[i];
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(duplicate2));



    }

}

