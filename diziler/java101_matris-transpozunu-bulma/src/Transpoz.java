public class Transpoz {

    public static void printMatrix(int[][] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
    }

    public static int[][] Transpose(int[][] arr){
        int[][] newArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = arr[j][i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matris : ");
        printMatrix(array);
        System.out.println("Transpoze : ");
        printMatrix(Transpose(array));

    }

}

