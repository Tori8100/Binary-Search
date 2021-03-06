// Given an integer n, return the number of 1 bits in n.

import java.util.*;

class Solution {
    public int solve(int n) {
        int count = 0;
        while (n > 0){
            if ((n % 2) > 0)
                count++;
            n = n >> 1;
        }
        return count;
    }
}