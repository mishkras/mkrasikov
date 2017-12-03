package ru.job4j.loop;

/**
 * Board.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * int add.
     *
     * @param width  - board width.
     * @param height - board height.
     * @return grafic picture of the board.
     */
    public String paint(int width, int height) {
        StringBuilder sb = new StringBuilder();
        String addX = "x";
        String addSpace = " ";
        String lineSerporator = "\r\n";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    sb.append(addX);
                } else if (i % 2 != 0 && j % 2 != 0) {
                    sb.append(addX);
                } else {
                    sb.append(addSpace);
                }
            }
            sb.append(lineSerporator);
        }
        return sb.toString();
    }
}