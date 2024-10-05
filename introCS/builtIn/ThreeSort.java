public class ThreeSort {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        int mid = num1 + num2 + num3 - max - min;
        System.out.println(min + " " + mid + " " + max);
    }
}
