package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < value.length; j++) {
                if (data.equals(value)) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }// проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}