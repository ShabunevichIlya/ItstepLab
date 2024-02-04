package by.itstep.shabunevich.homework.task_stage12.util;

public class MathUtil {
    public static int power(int base, int power) {
        int temp = 1;
        for (int i = 0; i < power; i++) {
            temp *= base;
        }
        return temp;
    }

    private MathUtil() {
    }
}
