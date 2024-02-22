package by.itstep.shabunevich.homework.task_stage15.model.logic;

public class MatrixManager {

    // MainDiagonal
    public static int getMaxAboveMainDiagonal(int[][] matrix) {
        int maxAbove = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (maxAbove < matrix[i][j]) {
                    maxAbove = matrix[i][j];
                }
            }
        }
        return maxAbove;
    }

    public static int getMinAboveMainDiagonal(int[][] matrix) {
        int minAbove = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (minAbove > matrix[i][j]) {
                    minAbove = matrix[i][j];
                }
            }
        }
        return minAbove;
    }

    public static int getMaxBelowMainDiagonal(int[][] matrix) {
        int maxBelow = 0;

        int rowLength = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            int j;
            if (i >= rowLength) {
                j = rowLength - 1;
            } else {
                j = i - 1;
            }
            for (; j >= 0; j--) {
                if (maxBelow < matrix[i][j]) {
                    maxBelow = matrix[i][j];
                }
            }
        }

        return maxBelow;
    }

    public static int getMinBelowMainDiagonal(int[][] matrix) {
        int minBelow = 0;

        int rowLength = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            int j;
            if (i >= rowLength) {
                j = rowLength - 1;
            } else {
                j = i - 1;
            }
            for (; j >= 0; j--) {
                if (minBelow > matrix[i][j]) {
                    minBelow = matrix[i][j];
                }
            }
        }

        return minBelow;
    }

    // SideDiagonal
    public static int getMaxAboveSideDiagonal(int[][] matrix) {
        int maxAbove = 0;
        int count = 0;

        for (int i = matrix.length - 2; i >= 0; i--) {
            int j;
            if (count < matrix[i].length) {
                j = count;
            } else {
                j = matrix[i].length - 1;
            }
            for (; j >= 0; j--) {
                if (maxAbove < matrix[i][j]) {
                    maxAbove = matrix[i][j];
                }
            }
            count++;
        }
        return maxAbove;
    }

/*
    public static int getMaxAboveSideDiagonalAnother(int[][] matrix) {
        Integer maxAbove = null;
        int rowShift = 0;
        int rowLength = matrix[0].length;

        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j <= rowShift; j++) {
                if (maxAbove == null || maxAbove < matrix[i][j]) {
                    maxAbove = matrix[i][j];
                }
            }
            if (rowShift < rowLength) {
                rowShift++;
            }
        }
        return Objects.requireNonNullElse(maxAbove, 0);
    }
*/

    public static int getMinAboveSideDiagonal(int[][] matrix) {
        int minAbove = 0;
        int count = 0;

        for (int i = matrix.length - 2; i >= 0; i--) {
            int j;
            if (count < matrix[i].length) {
                j = count;
            } else {
                j = matrix[i].length - 1;
            }
            for (; j >= 0; j--) {
                if (minAbove > matrix[i][j]) {
                    minAbove = matrix[i][j];
                }
            }
            count++;
        }
        return minAbove;
    }

    public static int getMaxBelowSideDiagonal(int[][] matrix) {
        int maxBelow = 0;

        int count = 1;

        for (int i = matrix.length - 1; i >= 0; i--) {
            int j;
            if (count < matrix[i].length) {
                j = count;
            } else {
                j = matrix[i].length - 1;
            }
            for (; j < matrix[i].length - 1; j++) {
                if (maxBelow < matrix[i][j]) {
                    maxBelow = matrix[i][j];
                }
            }
            count++;
        }
        return maxBelow;
    }

    public static int getMinBelowSideDiagonal(int[][] matrix) {
        int minBelow = 0;

        int count = 1;

        for (int i = matrix.length - 1; i >= 0; i--) {
            int j;
            if (count < matrix[i].length) {
                j = count;
            } else {
                j = matrix[i].length - 1;
            }
            for (; j < matrix[i].length - 1; j++) {
                if (minBelow > matrix[i][j]) {
                    minBelow = matrix[i][j];
                }
            }
            count++;
        }

        return minBelow;
    }

    private MatrixManager() {
    }
}