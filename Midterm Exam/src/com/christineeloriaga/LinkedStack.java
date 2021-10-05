package com.christineeloriaga;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    public boolean isEmpty;
    private LinkedList<Card> deck;
    private LinkedList<Card> hand;
    private LinkedList<Card> discard;
    private int top;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkedStack() {
        deck = new LinkedList<Card>();
        hand = new LinkedList<Card>();
        discard = new LinkedList<Card>();
    }

    public void push(Card card) {
        size++;
        deck.push(card);
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Card pop() {
        size--;
        return deck.pop();
    }

    public void printStack() {
        ListIterator<Card> iterator = deck.listIterator();

        System.out.println("\nCurrent cards on hand:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

}
