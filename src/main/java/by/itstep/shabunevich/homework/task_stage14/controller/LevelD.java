package by.itstep.shabunevich.homework.task_stage14.controller;

import by.itstep.shabunevich.homework.task_stage14.model.logic.VectorManager;
import by.itstep.shabunevich.homework.task_stage14.util.VectorController;
import by.itstep.shabunevich.homework.task_stage14.view.Printer;

import java.util.Arrays;

public class LevelD {
    public static void main(String[] args) {

        int[] vector = VectorController.createVector();
        Printer.printConsole(Arrays.toString(vector));

        Printer.printConsole(
                "\nThe sum of the elements located between the first and last zero elements: " +
                        VectorManager.calculateSumElementsBetweenFirstLastZeroElements(vector)
        );

        Printer.printConsole(
                "\nThe multiplication of the elements located between the first and last zero elements: " +
                        VectorManager.calculateMultiplicationElementsBetweenFirstLastZeroElements(vector)
        );
    }
}
