/*
Given a non-negative integer n, find a number r such that r * r = n and round down to the nearest integer.

Can you implement this without using the built-in square root?
*/

import java.util.*;

class Solution {
    public int solve(int n) {
        for (int i = 0; i <= n / 2; i++){
            if (i * i > n){
                return i - 1;
            }
        }
        return 0;
    }
}