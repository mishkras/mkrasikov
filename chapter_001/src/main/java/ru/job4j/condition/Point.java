package ru.job4j.condition;

/**
 * Point.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean is(int a, int b) {
        return (y == a * x + b);
    }
}