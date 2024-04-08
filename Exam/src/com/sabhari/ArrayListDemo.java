package com.sabhari;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<Integer>();
        intlist.add(5);
        intlist.add(0,9);
        for (int elem :
                intlist) {
            System.out.println(elem);
        }
    }
}
