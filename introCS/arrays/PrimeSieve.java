public class PrimeSieve {
    public static void main(String[] args) {
        int max_number = Integer.parseInt(args[0]);

        boolean[] prime_sieve = new boolean[max_number + 1];
        int root = (int)Math.sqrt(max_number);
        for(int i = 2; i <= max_number; i++) {
            prime_sieve[i] = true;
        }
        for(int i = 2; i * i < max_number; i++) {
            if(prime_sieve[i]) {
                for(int j = i; i * j <= max_number; j++) {
                    prime_sieve[i * j] = false;
                }
            }
        }
        int count =0;
        for(int i = 2; i < max_number; i++) {
            if(prime_sieve[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count +" number of primes ------");
    }
}
