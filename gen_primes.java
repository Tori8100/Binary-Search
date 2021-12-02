import java.util.*;

class Solution {
    public int[] solve(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int index = 2; index <= n; index++){
            if (index == 2){
                primes.add(index);
            }
            else{
                boolean prime = true;
                for (int j = 2; j <= index / 2; j++){
                    if(index % j == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    primes.add(index);
            }
        }

        int[] primeArray = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++){
            primeArray[i] = primes.get(i);
        }
        
        return primeArray;
    }
}