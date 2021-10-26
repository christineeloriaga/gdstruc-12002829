package com.christineeloriaga;

public class Main {

    public static void main(String[] args) {
	    ArrayQueue queue = new ArrayQueue(5);
	    
	    queue.add(new Player(1,"Kaeya", 100));
	    queue.add(new Player(2, "Diluc", 100));
	    queue.add(new Player(3, "Zhongli", 95));
	    queue.add(new Player(4, "Tartaglia", 90));

        queue.printQueue();
        // queue.add(new Player(5, "Thoma", 95));
		queue.remove();

        System.out.println("After popping:\n");
        queue.printQueue();
    }
}
