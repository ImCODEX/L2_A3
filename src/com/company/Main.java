package com.company;

public class Main {

    public static void main(String[] args) {
        Methods m = new Methods();
        int[] zahl1 = new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[]{8, 2, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl3 = new int[]{1, 0, 0};

        System.out.println(java.util.Arrays.toString(m.add(zahl1, zahl2)));
        System.out.println(java.util.Arrays.toString(m.diff(zahl1, zahl2)));
        System.out.println(java.util.Arrays.toString(m.mul(zahl3, 9)));
    }
}
