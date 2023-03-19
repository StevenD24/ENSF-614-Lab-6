/*
 *  File Name: DoubleArrayListSubject.java
 *  Assignment: ENSF 614 Lab 6 Exercise D
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    private ArrayList<Observer> observers;
    public ArrayList<Double> data;

    public DoubleArrayListSubject() {
        this.observers= new ArrayList<>();
        this.data = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
        o.update(this.data);
    }

    @Override
    public void remove(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer o = this.observers.get(i);
            o.update(this.data);
        }
    }

    public void addData(Double value) {
        this.data.add(value);
        notifyAllObservers();
    }

    public void setData(Double value, int index) {
        this.data.set(index, value);
        notifyAllObservers();
    }

    public void populate(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.data.add(arr[i]);
        }

        notifyAllObservers();
    }

    public void display() {
        if (this.data.size() == 0) {
            System.out.println("Empty list ...");
        }

        for (int i = 0; i < this.data.size(); i++) {
            System.out.printf("%.1f ", this.data.get(i));
        }

        System.out.println();
    }

}
