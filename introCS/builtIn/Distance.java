public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 1000) / 1000.0;

        System.out.println("the distance between (" + x + ", " + y + ") and origin is " + distance);

    }
}