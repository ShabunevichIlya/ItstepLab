package by.itstep.shabunevich.homework.task_stage14.controller;

import by.itstep.shabunevich.homework.task_stage14.model.logic.VectorManager;
import by.itstep.shabunevich.homework.task_stage14.util.VectorController;
import by.itstep.shabunevich.homework.task_stage14.view.Printer;

public class LevelC {
    public static void main(String[] args) {

        int[] vector = VectorController.createVector();
        int arithmeticMean = VectorManager.getArithmeticMeanValue(vector);
        int geometricMean = VectorManager.getGeometricMeanValue(vector);

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are greater than the vector arithmetic mean: " +
                        VectorManager.getCountGreaterThanBound(vector, arithmeticMean)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are less than the vector arithmetic mean: " +
                        VectorManager.getCountLessThanBound(vector, arithmeticMean)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are greater than the vector geometric mean: " +
                        VectorManager.getCountGreaterThanBound(vector, geometricMean)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are less than the vector geometric mean: " +
                        VectorManager.getCountLessThanBound(vector, geometricMean)
        );
    }
}
