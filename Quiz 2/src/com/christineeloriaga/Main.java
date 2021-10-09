package com.christineeloriaga;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

       LinkedList linkedList = new LinkedList();

        Player kaeya = new Player(1, "Kaeya", 90);
        Player diluc = new Player(2, "Diluc", 70);
        Player venti = new Player(3, "Venti", 52);

        linkedList.add(kaeya);
        linkedList.add(diluc);
        linkedList.add(venti);

        System.out.println(linkedList);

        // Answer for No. 1

        linkedList.removeFirst();
        System.out.println(linkedList);

        // Answer for No. 2

        System.out.println(linkedList.size());

        // Answer for No. 3

        System.out.println(linkedList.contains(new Player(3,"Venti", 52)));
        System.out.println("\n" + linkedList.indexOf(new Player(3,"Venti", 52)));
    }
}