package by.itstep.shabunevich.homework.task_stage15.util;

import java.util.Random;

public class MatrixController {

    public static final Random RANDOM = new Random();
    public static final int ROWS_MAX = 10;
    public static final int COLUMNS_MAX = 10;
    public static final int MAX_BOUND = 10;
    public static final int MIN_BOUND = -10;


    public static int[][] getMatrix(int row, int column){

        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RANDOM.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
            }
        }
        return matrix;
    }

    public static int[][] createRandomMatrix() {
        int rows = RANDOM.nextInt(ROWS_MAX) + 1;
        int columns = RANDOM.nextInt(COLUMNS_MAX) + 1;
        return getMatrix(rows, columns);
    }

    private MatrixController() {
    }

}
