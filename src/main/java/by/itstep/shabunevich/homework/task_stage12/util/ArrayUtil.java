package by.itstep.shabunevich.homework.task_stage12.util;

public class ArrayUtil {
    public static boolean increase(int[] numbers) {
        int i = numbers.length - 1;
        boolean moved = false;
        for (int index = i; index >= 0; index--) {
            if (numbers[index] != 9) { // digit (от 0  до 9)
                numbers[index] += 1;
                if (moved) {
                    for (int k = index + 1; k <= i; k++) {
                        numbers[k] = numbers[index];
                    }
                }
                return true;
            } else {
                moved = true;
            }
        }
        return false;
    }

    public static int[] convertArray(int sequence) {
        String s = Integer.toString(sequence);
        int[] array = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            array[i] = sequence % 10;
            sequence /= 10;
        }
        return array;
    }

    private ArrayUtil() {
    }
}
