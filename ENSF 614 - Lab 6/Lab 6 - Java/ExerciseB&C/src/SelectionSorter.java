/*
 *  File Name: SelectionSorter.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

// SelectionSorter class
class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getItem().compareTo(list.get(minIndex).getItem()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Item<E> temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
