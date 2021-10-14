package com.company;

public class Methods {

    /**
     * Sum between two arrays with the same length
     * treated as a decimal representation of a number
     * @param zahl1: number represented on array
     * @param zahl2: number represented on array
     * @return: sum of zahl1 and zahl2
     */
    public int[] add(int[] zahl1, int[] zahl2) {
        int[] sum = new int[zahl1.length + 1];

        for (int i = zahl1.length - 1; i >= 0; i--) {
            sum[i + 1] += zahl1[i] + zahl2[i];
            if (sum[i + 1] > 9) {
                sum[i]++;
                sum[i + 1] -= 10;
            }
        }

        if (sum[0] == 0) {
            int[] new_sum = new int[zahl1.length];
            System.arraycopy(sum, 1, new_sum, 0, sum.length - 1);
            return new_sum;
        }
        return sum;
    }
}
