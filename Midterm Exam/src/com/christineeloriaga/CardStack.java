package com.christineeloriaga;

import java.util.EmptyStackException;

public class CardStack {
    private Card[] deck;
    private Card[] hand;
    private Card[] discard;
    private int top;
    private int size;

    public CardStack(int capacity)
    {
        deck = new Card[capacity];
    }

    public void push(Card card)
    {
        if (top == deck.length) //stack is full
        {
            Card[] hand = new Card[2 * deck.length];
            System.arraycopy(deck, 0, hand, 0, deck.length);
            deck = hand;
        }

        deck[top++] = card;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = deck[--top];
        deck[top] = null;
        return poppedCard;
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Current cards on hand:");

        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(deck[i]);
        }
    }
}


