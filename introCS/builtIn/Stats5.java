public class Stats5 {
    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();

        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("Numbers are " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        System.out.println("Max is " + Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5)))));
        System.out.println("Min is " + Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5)))));
        System.out.println("Average is " + avg);
    }
}
