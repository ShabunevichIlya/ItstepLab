package by.itstep.shabunevich.homework.task_stage12.util;

import by.itstep.shabunevich.homework.task_stage12.view.Printer;

import java.util.Scanner;

public class DigitInputController {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputDigit() {
        int digit;
        do {
            Printer.printConsole("Input count of digit: ");
            digit = SCANNER.nextInt();
        } while (digit < 1);

        return digit;
    }

    private DigitInputController() {
    }
}
