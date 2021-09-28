package com.ankit.JavaAssignment;

import java.util.LinkedList;
import java.util.ListIterator;
/*
Create a linklist class and iterate the class using ListIterator.
*/
public class Assignment10_ListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();

        for(int i=1;i<=10;i++){
            list.add(i*10);
        }

        ListIterator iterator= list.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
