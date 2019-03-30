package evenAndOddElementsInList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /* создать список, заполнить его 100 случайными числами, с помоцью итератора списка:
        - определить, сколько нечетных чисел в списке;
        - удалить все четные элементы через итератор. */


        // создание списка и вывод его на экран
        int size = 10;
        List<Integer> list = getListFillingRandomValues(size);
        showList(list);

        // получение количества нечетных значений и вывод с помоцью итератора
        int countOdd = getCountOfOddNumbers(list.iterator());
        System.out.println("\nCount odd numbers in the List = " + countOdd);

        // удаление нечетных значений из списка и вывод на экран
        removeEvenNumbersFromIterator(list.iterator());
        System.out.println("\nList after removing even numbers:");
        showList(list);
    }

    private static List<Integer> getListFillingRandomValues(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(getRandomValue(20));
        }
        return list;
    }

    private static int getRandomValue(int max) {
        return new Random().nextInt(max);
    }

    private static void showList(List list) {
        for (Object element : list) {
            System.out.print(element.toString() + "\t");
        }
        System.out.println();
    }

    private static int getCountOfOddNumbers(Iterator<Integer> it) {
        int count = 0;
        while (it.hasNext()) {
            if(it.next() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static void removeEvenNumbersFromIterator(Iterator<Integer> it) {
        while (it.hasNext()) {
            if(it.next() % 2 == 0) {
                it.remove();
            }
        }
    }
}
