package by.itstep.shabunevich.homework.task_stage15.controller;

import by.itstep.shabunevich.homework.task_stage15.model.logic.MatrixManager;
import by.itstep.shabunevich.homework.task_stage15.util.MatrixController;
import by.itstep.shabunevich.homework.task_stage15.view.Printer;

public class LevelA {
    public static void main(String[] args) {

        int[][] matrix = MatrixController.createRandomMatrix();

//        main
        Printer.printConsole(
                "The maximum value among the elements that are above the main diagonal: " +
                        MatrixManager.getMaxAboveMainDiagonal(matrix));
        Printer.printConsole(
                "\nThe minimum value among the elements that are above the main diagonal: " +
                        MatrixManager.getMinAboveMainDiagonal(matrix));
        Printer.printConsole(
                "\nThe maximum value among the elements that are below the main diagonal: " +
                        MatrixManager.getMaxBelowMainDiagonal(matrix));
        Printer.printConsole(
                "\nThe minimum value among the elements that are below the main diagonal: " +
                        MatrixManager.getMinBelowMainDiagonal(matrix));
        // Side
        Printer.printConsole(
                "\nThe maximum value among the elements that are above the main diagonal: " +
                        MatrixManager.getMaxAboveSideDiagonal(matrix));
        Printer.printConsole(
                "\nThe minimum value among the elements that are above the main diagonal: " +
                        MatrixManager.getMinAboveSideDiagonal(matrix));

        Printer.printConsole(
                "\nThe maximum value among the elements that are below the main diagonal: " +
                        MatrixManager.getMaxBelowSideDiagonal(matrix));
        Printer.printConsole(
                "\nThe minimum value among the elements that are below the main diagonal: " +
                        MatrixManager.getMinBelowSideDiagonal(matrix));

    }
}
