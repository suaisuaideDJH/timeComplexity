public class text {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            long prime = (long) (Math.random() * 1000000000 + 100000000);
            boolean result = isPrime(primeBeforeMax(prime),prime);
            if (result==true){
                System.out.println(prime);
                break;
            }
        }
    }
    public static boolean[] primeBeforeMax(long num) {
        int max = (int) Math.pow(num, 0.5);
        int i;
        int n = 2;
        boolean[] nums = new boolean[max];
        for (; n < max; n++) {
            if (!nums[n]) {
                i = n + n;
                for (; i < max; i = i + n) {
                    nums[i] = true;
                }
            }
        }
        return nums;
    }

    public static boolean isPrime(boolean[] nums, long num) {
        int n = 2;
        for (; n < nums.length; n++) {
            if (!nums[n]) {
                if (num % n == 0)
                    return false;
            }
        }
        return true;
    }
}
