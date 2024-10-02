public class SumOfTwoDice {
    public static void main(String[] args) {

        for(int i = 0; i < 50; i++) {
            int a = (int)Math.floor(Math.random() * 6) + 1;
            int b = (int)Math.floor(Math.random() * 6) + 1;
            if(a < 1 || b < 1 || a > 6 || b > 6) {
                throw new Error("dice value is invalid");
            }
            System.out.println("Sum of " + a + " and " + b + " = " + (a + b));

        }
    }
}
