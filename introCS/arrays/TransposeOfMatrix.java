public class TransposeOfMatrix {
    public static double round(double number) {
        return Math.floor(number * 1000) / 1000;
    }
    public static void initialize(double[][] matrix) {
        int highestNumber = (int) (Math.random() * 100);
        System.out.println("highest number " + highestNumber);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = round(Math.random() * highestNumber); 
            }
        }
    }
    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        double[][] matrix = new double[size][size];

        initialize(matrix);
        printMatrix(matrix);

        for(int i = 0; i < size; i++) {
            for(int j = i; j < size; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("printing transpose-------");
        printMatrix(matrix);
    }
}
