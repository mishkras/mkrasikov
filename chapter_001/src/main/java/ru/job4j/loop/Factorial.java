package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            if (n > 0) {
                factorial *= i;
            } else if (n == 0) {
                factorial = 1;
            } else {
                System.out.println("Error");
            }
        }
        return factorial;
    }
}
