/*
 *  File Name: OneRow_Observer.java
 *  Assignment: ENSF 614 Lab 6 Exercise D
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

public class OneRow_Observer implements Observer {
    private Subject subject;
    private ArrayList<Double> arr;

    public OneRow_Observer(Subject s) {
        this.subject = s;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        System.out.println("\nNotification to One-Row Observer: Data Changed:");
        this.arr = arr;
        this.display();
    }

    public void display() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.1f  ", arr.get(i));
        }
        System.out.println();
    }
}
