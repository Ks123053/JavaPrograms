package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("kavya");
        list.add("kim");
        list.add("kardashian");
        list.add("kenya");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());



    }
}