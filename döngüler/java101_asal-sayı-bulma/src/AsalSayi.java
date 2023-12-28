public class AsalSayi {
    public static void main(String[] args) {
        int count = 0, number;

        for (number = 2; number <= 100; number++) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                        count++;
                }
            }
            if(count == 0) {
                System.out.print(number + " ");
            }
            count = 0;
        }

        System.out.println();
    }
}

