package by.itstep.shabunevich.homework.task_stage14.controller;

import by.itstep.shabunevich.homework.task_stage14.model.logic.VectorManager;
import by.itstep.shabunevich.homework.task_stage14.util.VectorController;
import by.itstep.shabunevich.homework.task_stage14.view.Printer;

public class LevelA {

    public static void main(String[] args) {

        int[] vector = VectorController.createVector();

        Printer.printConsole(
                "\nThe number of zero values of the elements of the vector of integer values is: " +
                        VectorManager.getCountZeroValues(vector)
        );

        Printer.printConsole(
                "\nThe number of non-zero values of the elements of the vector of integer values is: " +
                        VectorManager.getCountNonZeroValues(vector)
        );

        Printer.printConsole(
                "\nThe number of odd values of the elements of the vector of integer values is: " +
                        VectorManager.getCountOddValues(vector)
        );

        Printer.printConsole(
                "\nThe number of even values of the elements of the vector of integer values is: " +
                        VectorManager.getCountEvenValues(vector)
        );

        Printer.printConsole(
                "\nThe number of positive values of the elements of the vector of integer values is: " +
                        VectorManager.getCountPositiveValues(vector)
        );

        Printer.printConsole(
                "\nThe number of negative  values of the elements of the vector of integer values is: " +
                        VectorManager.getCountNegativeValues(vector)
        );
    }
}
