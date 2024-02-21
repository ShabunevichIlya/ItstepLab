package by.itstep.shabunevich.homework.task_stage14.util;

import by.itstep.shabunevich.homework.task_stage14.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class VectorController {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Random RANDOM = new Random();

    private VectorController() {
    }

    public static int[] getVector(int size, int max, int min) {

        if (min > max) {
            int t = max;
            max = min;
            min = t;
        }

        int[] vector = new int[size];

        int length = vector.length;
        for (int i = 0; i < length; i++) {
            vector[i] = RANDOM.nextInt(max - min + 1) + min;
        }

        return vector;
    }

    public static int[] createVector() {
        Printer.printConsole("Input the upper and lower bounds of the random.");

        Printer.printConsole("\nMax: ");
        int max = SCANNER.nextInt();

        Printer.printConsole("Min: ");
        int min = SCANNER.nextInt();

        Printer.printConsole("Input the dimension of the vector: ");
        int size = SCANNER.nextInt();

        return getVector(size, max, min);
    }
}
