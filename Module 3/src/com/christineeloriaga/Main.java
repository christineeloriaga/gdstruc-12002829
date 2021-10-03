package com.christineeloriaga;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "Lumine", 100));
        stack.push(new Player(2, "Amber", 100));
        stack.push(new Player(3, "Kaeya", 95));
        stack.push(new Player(4, "Lisa", 90));

        stack.printStack();

        System.out.println("Popping: " + stack.pop());

        stack.printStack();
    }
}
