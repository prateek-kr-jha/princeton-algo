public class SumOfSines {
    public static void main(String[] args) {
        double angle_in_radians = (Double.parseDouble(args[0]) * Math.PI) / 180;
        // double angle2 = Double.parseDouble(args[1]);
        double sum = Math.floor((Math.sin(2 * angle_in_radians) + Math.sin(3 * angle_in_radians)) * 1000) / 1000;
        System.out.println("sin2t + sin3t = " + sum);
    }
}
