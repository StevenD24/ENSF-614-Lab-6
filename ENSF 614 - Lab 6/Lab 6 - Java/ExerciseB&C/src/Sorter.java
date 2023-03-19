/*
 *  File Name: Sorter.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

public interface Sorter<E extends Number & Comparable<E>> {
    public void sort(ArrayList<Item<E>> list);
}
