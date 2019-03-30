package myListImplementation.mainClass;


import myListImplementation.list.MyList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Реализовать свою имплементацию интерфейса List - список в котором не
        может быть дубликатов; */


        // создание основного списка
        MyList myList = new MyList();

        // добавление элементов в основной список
        System.out.println("Add in myList: " + myList.add(1));
        System.out.println("Add in myList: " + myList.add(2));
        System.out.println("Add in myList: " + myList.add(3));
        System.out.println("Add in myList: " + myList.add(2));

        // создание промежуточного списка
        ArrayList array = new ArrayList();

        // добавление элементов в промежуточный список
        System.out.println("\nAdd in array: " + array.add(8));
        System.out.println("Add in array: " + array.add(44));

        // добавление промежуточного списка в основной по конкретному индексу
        System.out.println("\nAdd all from array in myList: " + myList.addAll(2, array));

        // добавление элемента в основной список по конкретному индексу
        myList.add(22, 55);

        // вывод результирующего списка на экран
        System.out.print("\nMy List: ");
        for (Object o : myList) {
            System.out.print(o.toString() + " ");
        }
    }
}