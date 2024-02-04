package by.itstep.shabunevich.homework.task_stage12.model.logic;

import by.itstep.shabunevich.homework.task_stage12.util.ArrayUtil;
import by.itstep.shabunevich.homework.task_stage12.util.ListUtil;
import by.itstep.shabunevich.homework.task_stage12.util.MathUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArmstrongNumberManager {

    public static final int NOT_ARMSTRONG_NUMBER = -1;

    public static List<Integer> findAllArmstrongNumbers(int digit) {
        boolean contFori = true;
        int[] numbers = new int[digit];
        List<Integer> armstrongNumbers = new ArrayList<>();

        while (contFori) {
            int powSum = 0;
            for (int number : numbers) {
                powSum += MathUtil.power(number, digit);
            }

            int armstrongNumber = ArmstrongNumberManager.checkArmstrongNumber(numbers, powSum);
            if (armstrongNumber != ArmstrongNumberManager.NOT_ARMSTRONG_NUMBER) {
                armstrongNumbers.add(armstrongNumber);
            }
            contFori = ArrayUtil.increase(numbers);
        }
        return armstrongNumbers;
    }

    private static int checkArmstrongNumber(int[] numbers, int powSum) {
        int[] tempNumbers = ArrayUtil.convertArray(powSum);

        List<Integer> tempNumbersList1 = ListUtil.convertToOrderedList(numbers);

        List<Integer> tempNumbersList2 = ListUtil.convertToOrderedList(tempNumbers);

        if (tempNumbersList1.size() == tempNumbersList2.size()) {
            for (int i = 0; i < tempNumbersList2.size(); i++) {
                if (!Objects.equals(tempNumbersList2.get(i), tempNumbersList1.get(i))) {
                    return NOT_ARMSTRONG_NUMBER;
                }
            }
            return powSum;
        }
        return NOT_ARMSTRONG_NUMBER;
    }

    private ArmstrongNumberManager() {
    }
}
