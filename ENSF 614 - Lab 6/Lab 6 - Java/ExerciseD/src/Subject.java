/*
 *  File Name: Subject.java
 *  Assignment: ENSF 614 Lab 6 Exercise D
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void remove(Observer o);
    public void notifyAllObservers();
}
