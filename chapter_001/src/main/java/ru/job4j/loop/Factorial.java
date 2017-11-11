package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            if (n == 0) {
                factorial = 1;
            } else {
                factorial *= i;
            }
        }
        return factorial;
    }
}
