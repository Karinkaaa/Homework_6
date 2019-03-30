package multiplyListItems.mainClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /* - создать два списка;
        - сгенерировать 2 случайных числа от 100 до 200 (M, N);
        - заполнить список 1 M случайными числами;
        - заполнить список 2 N случайными числами;
        - перемножить все элементы списка, и результат сохранить в третий список. */


        // границы значений
        int minBound = 100;
        int maxBound = 200;

        // размеры списков
        int sizeOfFirstList = getRandomValue(minBound, maxBound);
        int sizeOfSecondList = getRandomValue(minBound, maxBound);

        // списки, заполненные рандомными значениями
        List<Integer> firstList = getListFillingRandomValues(sizeOfFirstList);
        List<Integer> secondList = getListFillingRandomValues(sizeOfSecondList);

        // вывод списков на экран
        showList(firstList);
        showList(secondList);

        // результирующий список, состоящий из перемноженных элементов предыдущих двух списков
        List<Integer> result = multiplyLists(firstList, secondList);

        // вывод результирующего списка на экран
        System.out.println("\nResulting List:");
        showList(result);
    }

    private static int getRandomValue(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    private static int getRandomValue() {
        return getRandomValue(0, 20);
    }

    private static List<Integer> getListFillingRandomValues(int sizeOfList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(getRandomValue());
        }
        return list;
    }

    private static void showList(List list) {
        for (Object element : list) {
            System.out.print(element.toString() + "\t");
        }
        System.out.println();
    }

    private static List<Integer> multiplyLists(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        int size = Math.max(firstList.size(), secondList.size());
        for (int i = 0; i < size; i++) {
            if (i >= firstList.size()) {
                result.add(secondList.get(i));
            } else if (i >= secondList.size()) {
                result.add(firstList.get(i));
            } else {
                result.add(firstList.get(i) * secondList.get(i));
            }
        }
        return result;
    }
}
