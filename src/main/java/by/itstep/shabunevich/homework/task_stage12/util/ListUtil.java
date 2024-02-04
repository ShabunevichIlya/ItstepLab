package by.itstep.shabunevich.homework.task_stage12.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtil {
    public static List<Integer> convertToOrderedList(int[] numbers){
        List<Integer> numbersList = new ArrayList<>();
        for (int i : numbers) {
            numbersList.add(i);
        }
        numbersList.sort(Comparator.naturalOrder());

        return numbersList;
    }

    private ListUtil() {}
}
