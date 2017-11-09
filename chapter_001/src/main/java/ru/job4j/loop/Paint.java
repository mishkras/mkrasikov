package ru.job4j.loop;

/**
 * Paint.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * int add.
     * @param h - number of the lines.
     * @return grafic picture of the board.
     */
    String piramid(int h) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < h; i++) {
            for (int j = 0; j <= h * 2 - 2; j++) {
                if(j > h - 2 - i && j < h + i){
                    sb.append("^");
                }
                else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
