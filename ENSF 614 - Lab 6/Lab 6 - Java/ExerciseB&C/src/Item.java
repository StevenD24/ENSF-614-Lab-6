/*
 *  File Name: Item.java
 *  Assignment: ENSF 614 Lab 6 Exercise B
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

class Item <E extends Number & Comparable<E> >{
    private E item;
    public Item(E value) {
        item = value;
    }

    public void setItem(E value){
        item = value;
    }

    public E getItem(){
        return item;
    }
}
