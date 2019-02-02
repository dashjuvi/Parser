public class Solution {
    public ArrayList<Integer> primesum(int n) {

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++)
            isPrime[i] = true;

        // determine primes < n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor < n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j < n; j++)
                    isPrime[factor*j] = false;
            }
        }
        // count primes
        int primes = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i]) primes++;


        // store primes in list
        int[] list = new int[primes];
        int count = 0;
        for (int i = 0; i < n; i++)
            if (isPrime[i]) list[count++] = i;

        // check if n can be expressed as sum of two primes
        int left = 0, right = count-1;
        while (left <= right) {
            if      (list[left] + list[right] == n) break;
            else if (list[left] + list[right]  < n) left++;
            else right--;
        }
        ArrayList<Integer> cosa = new ArrayList<Integer>();
for (int i : list)
{
    cosa.add(i);
}
        ArrayList<Integer> lmao = new ArrayList<Integer>();
        lmao.add(list[left]);
        lmao.add(list[right]);
        return lmao;
    }
}
