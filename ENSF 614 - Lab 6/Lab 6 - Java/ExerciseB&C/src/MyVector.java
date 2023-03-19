/*
 *  File Name: MyVector.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

public class MyVector<E extends Number & Comparable<E>>{
    private ArrayList<Item<E>> storageM;
    private Sorter<E> sorter;

    MyVector(int n) {
        this.storageM = new ArrayList<>(n);
    }

    MyVector(ArrayList<Item<E>> arr) {
        this.storageM = new ArrayList<>(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            this.storageM.add(arr.get(i));
        }
    }

    public void add(Item<E> value) {
        this.storageM.add(value);
    }

    public void setSortStrategy(Sorter<E> s) {
        this.sorter = s;
    }

    public void performSort() {
        this.sorter.sort(this.storageM);
    }

    public void display() {
        for (int i = 0; i < storageM.size(); i++) {
            E value = storageM.get(i).getItem();
            if (value instanceof Integer) {
                System.out.print(value.intValue() + " ");
            } else {
                System.out.print(String.format("%.2f", value.doubleValue()) + " ");
            }
        }
        System.out.println();
    }

}
