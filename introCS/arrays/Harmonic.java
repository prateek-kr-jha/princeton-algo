public class Harmonic {
    public static double round(double number) {
        return Math.floor(number * 1000) / 1000;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[] harmonic_sum = new double[n];

        for(int i =1; i < n; i++){
            harmonic_sum[i] = round(harmonic_sum[i - 1] + (1.0/ i));
            System.out.println(harmonic_sum[i] + " sum till " + i);
        }
    }    
}
