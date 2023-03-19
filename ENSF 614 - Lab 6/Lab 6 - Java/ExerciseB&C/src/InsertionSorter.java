/*
 *  File Name: InsertionSorter.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            Item<E> key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getItem().compareTo(key.getItem()) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
}