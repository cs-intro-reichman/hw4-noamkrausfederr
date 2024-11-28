public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arrnums = new int[n + 1];
        for (int i = 0; i < arrnums.length; i++) {
            arrnums[i] = i;
        }
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i < arr.length; i ++) {
            arr[i] = true;
        }
        for (int i = 2; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (j % i == 0)
                {
                    arr[j] = false;
                }
            }   
        }
    }
}