package by.itstep.shabunevich.homework.task_stage12.view;

import java.util.Comparator;
import java.util.List;

public class UI {
    public static String determineResult(List<Integer> allArmstrongNumbers) {

        if (allArmstrongNumbers.isEmpty()) {
            return "There is not Armstrong number.";
        } else {
            allArmstrongNumbers.sort(Comparator.naturalOrder());
            return "Armstrong numbers: " + allArmstrongNumbers;
        }
    }

    private UI() {
    }
}
