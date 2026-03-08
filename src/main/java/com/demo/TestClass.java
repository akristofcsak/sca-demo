package com.demo;

public abstract class TestClass {
    /**
     * Method A. Does nothing important.
     */
    public static void methodA() {
        System.out.println("Methode A!");
    }

    /**
     * Method B. Does nothing important.
     */
    public static void MethodB() {
        System.out.println("Methode B!");
    }

    /**
     * Calculates the sum of two integers.
     * @param a the first number
     * @param b the second number
     * @return the sum of both numbers
     */
    public static int sum(final int a, final int b) {
        return a + b;
    }
}
