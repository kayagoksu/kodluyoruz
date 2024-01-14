public class OrtBulma {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};

        double sum = 0.0;
        double harmonicSum = 0.0;

        for (int i : dizi) {
            sum += i;
        }

        System.out.println("Dizi elemanları toplamı : " + sum);
        double average = sum / dizi.length;
        System.out.println("Dizi elemanları ortalaması : " + average);

        for (double i : dizi) {
            harmonicSum += (1 / i);
        }

        double harmonicMean = dizi.length / harmonicSum;
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);

    }

}

