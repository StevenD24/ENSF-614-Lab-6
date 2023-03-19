/*
 *  File Name: FiveRowsTable_Observer.java
 *  Assignment: ENSF 614 Lab 6 Exercise D
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    private Subject subject;
    private ArrayList<Double> arr;

    public FiveRowsTable_Observer(Subject s) {
        this.subject = s;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
        this.arr = arr;
        this.display();
    }

    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < arr.size(); j+=5) {
                System.out.printf("%.1f\t", arr.get(j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
