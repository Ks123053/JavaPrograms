package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(12);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);


    }

}




