package com.demo;

public abstract class TestClass {
    /**
     * Method A.
     */
    public static void methodA() {
        System.out.println("Methode A!");
    }

    /**
     * Method B.
     */
    public static void methodB() {
        System.out.println("Methode B!");
    }

    /**
     * Method sum.
     * @param a the first number
     * @param b the second number
     * @return the sum of both numbers
     */
    public static int sum(final int a, final int b) {
        return a + b;
    }
}
