/*
 *  File Name: BubbleSorter.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getItem().compareTo(list.get(j+1).getItem()) > 0) {
                    Item<E> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}