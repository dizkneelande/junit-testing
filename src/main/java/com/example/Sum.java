package com.example;

public class Sum {
    public int doSum(int i, int i1) throws Exception {
        int sum = i + i1;
        if (i > 0 && i1 > 0 && sum < 0) {
            throw new Exception("Overflow!");
        }
        return sum;
    }
}
