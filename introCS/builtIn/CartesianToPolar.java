public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = (Math.atan2(y, x) * 180) / Math.PI;
        System.err.println("Cartesian x = " + x + " and y = " + y);
        System.err.println("Cartesian r = " + r + " and theta = " + theta);
    }
}
