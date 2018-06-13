package ru.job4j.array;

/**
 * Square.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * Заполняет массив квадратом чисел.
     * @param bound - длинна массива.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (i + 1) * (i + 1);
            System.out.println(rst[i]);
        }// заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}