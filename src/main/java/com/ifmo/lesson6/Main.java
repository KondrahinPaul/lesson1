package com.ifmo.lesson6;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i: list) {
            System.out.println(i);
        }
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
