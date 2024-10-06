public class RollLoaded {
    public static void main(String[] args) {
        double result = Math.random();
        System.out.println("random : " + result);
        int roll;

        if(result < 1.0/8.0) roll = 1;
        else if(result < 2.0/8.0) roll = 2;
        else if(result < 3.0/8.0) roll = 3;
        else if(result < 4.0/8.0) roll = 4;
        else if(result < 5.0/8.0) roll = 5;
        else roll = 6;

        System.out.println(roll);
    }
}
