package by.itstep.shabunevich.homework.task_stage14.model.logic;

public class VectorManager {
    private VectorManager() {
    }

    //    Level A

    public static int getCountEvenValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i % 2 == 0 && i != 0) {
                count++;
            }
        }

        return count;
    }

    public static int getCountOddValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (Math.abs(i) % 2 == 1) {
                count++;
            }
        }

        return count;
    }

    public static int getCountPositiveValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i > 0) {
                count++;
            }
        }

        return count;
    }

    public static int getCountNegativeValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i < 0) {
                count++;
            }
        }

        return count;
    }

    public static int getCountZeroValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i == 0) {
                count++;
            }
        }

        return count;
    }

    public static int getCountNonZeroValues(int[] vector) {

        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i != 0) {
                count++;
            }
        }

        return count;
    }

//    Level B

    public static int getCountGreaterThanBound(int[] vector, int bound) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i > bound) {
                count++;
            }
        }

        return count;
    }

    public static int getCountLessThanBound(int[] vector, int bound) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i < bound) {
                count++;
            }
        }

        return count;
    }

    public static int getCountEqualsBound(int[] vector, int bound) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i == bound) {
                count++;
            }
        }

        return count;
    }

    public static int getCountNotEqualsBound(int[] vector, int bound) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (int i : vector) {
            if (i != bound) {
                count++;
            }
        }

        return count;
    }

    //    Level C

    public static int getArithmeticMeanValue(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i : vector) {
            sum += i;
        }
        return sum/vector.length;
    }

    public static int getGeometricMeanValue(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }

        int sum = 1;
        for (int i : vector) {
            sum *= i;
        }
        return sum/vector.length;
    }

    //    Level D

    public static int calculateSumElementsBetweenFirstLastZeroElements(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }
        int firstZero = getFirstZeroElements(vector);
        int lastZero = getLastZeroElements(vector);

        int sum =0;
        for ( int i = firstZero + 1; i < lastZero; i++) {
            sum += vector[i];
        }
        return sum;
    }

    public static int calculateMultiplicationElementsBetweenFirstLastZeroElements(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException();
        }
        int firstZero = getFirstZeroElements(vector);
        int lastZero = getLastZeroElements(vector);

        if (firstZero == lastZero){
            return 0;
        }

        int multi =1;
        for ( int i = firstZero + 1; i < lastZero; i++) {
            multi *= vector[i];
        }
        return multi;
    }

    private static int getFirstZeroElements(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    private static int getLastZeroElements(int[] vector) {
        for (int i = vector.length-1; i >= 0; i--) {
            if (vector[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
