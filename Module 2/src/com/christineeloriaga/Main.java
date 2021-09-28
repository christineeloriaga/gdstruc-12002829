package com.christineeloriaga;

public class Main {

    public static void main(String[] args) {

        Player kaeya = new Player(1, "Kaeya", 100);
        Player diluc = new Player(2, "Diluc", 205);
        Player venti = new Player(3, "Venti", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(kaeya);
        playerLinkedList.addToFront(diluc);
        playerLinkedList.addToFront(venti);

        playerLinkedList.printList();
    }
}
