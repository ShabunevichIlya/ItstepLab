package by.itstep.shabunevich.homework.task_stage14.controller;

import by.itstep.shabunevich.homework.task_stage14.model.logic.VectorManager;
import by.itstep.shabunevich.homework.task_stage14.util.VectorController;
import by.itstep.shabunevich.homework.task_stage14.view.Printer;

import java.util.Scanner;


public class LevelB {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Printer.printConsole("Input the boundary number N: ");
        int bound = SCANNER.nextInt();

        int[] vector = VectorController.createVector();

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are greater than the boundary number N: " +
                        VectorManager.getCountGreaterThanBound(vector, bound)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are less than the boundary number N: " +
                        VectorManager.getCountLessThanBound(vector, bound)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are equal to a boundary number N: " +
                        VectorManager.getCountEqualsBound(vector, bound)
        );

        Printer.printConsole(
                "\nThe number of elements of the vector of integer values that are non-equal to a boundary number N: " +
                        VectorManager.getCountNotEqualsBound(vector, bound)
        );
    }
}
