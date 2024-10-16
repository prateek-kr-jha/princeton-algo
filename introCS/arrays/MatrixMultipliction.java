public class MatrixMultipliction {
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

    public static double[][] multiplyTwoMatrix(double[][] a, double[][] b) {
        int size = a.length;
        double[][] c = new double[size][size];
        for(int i = 0; i < size; i++) {
            for(int j =0; j < size; j++) {
                for(int k = 0; k < size; k++) {
                    c[i][j] += round(a[i][k] * b[k][j]);
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[][] a = new double[n][n];
        double[][] b = new double[n][n];
        initialize(a);
        initialize(b);
        System.out.println("Printing a: ");
        printMatrix(a);
        System.out.println("Printing b: ");
        printMatrix(b);
        double[][] c = multiplyTwoMatrix(a, b);
        System.out.println("printing product of a and b");
        printMatrix(c);
    }
}
