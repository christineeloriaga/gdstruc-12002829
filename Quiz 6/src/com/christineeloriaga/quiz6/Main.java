package com.christineeloriaga.quiz6;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);
        
        tree.traverseInOrderDescending();
        System.out.println(" ");
        System.out.println("Min Value:" + tree.getMin(tree.root));
        System.out.println("Max Value:" + tree.getMax(tree.root));
    }
}
