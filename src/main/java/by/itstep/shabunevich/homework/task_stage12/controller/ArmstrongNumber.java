package by.itstep.shabunevich.homework.task_stage12.controller;

import by.itstep.shabunevich.homework.task_stage12.model.logic.ArmstrongNumberManager;
import by.itstep.shabunevich.homework.task_stage12.util.DigitInputController;
import by.itstep.shabunevich.homework.task_stage12.view.Printer;
import by.itstep.shabunevich.homework.task_stage12.view.UI;

import java.util.List;


public class ArmstrongNumber {

    public static void main(String[] params) {

        Printer.printConsole("*** Armstrong Numbers ***\n");

        int digit = DigitInputController.inputDigit();

        List<Integer> allArmstrongNumbers = ArmstrongNumberManager.findAllArmstrongNumbers(digit);

        Printer.printConsole(UI.determineResult(allArmstrongNumbers));
    }
}
