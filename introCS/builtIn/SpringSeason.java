public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if((m >= 4 && m < 6) || (m == 3 && d >= 20) || (m == 6 && d <= 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
