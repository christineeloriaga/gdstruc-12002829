package com.christineeloriaga;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedStack deck = new LinkedStack();
        LinkedStack hand = new LinkedStack();
        LinkedStack discard = new LinkedStack();

        deck.push(new Card(1,"Amber"));
        deck.push(new Card(2,"Kaeya"));
        deck.push(new Card(3,"Lisa"));
        deck.push(new Card(4, "Xiangling"));
        deck.push(new Card(5, "Barbara"));
        deck.push(new Card(6, "Diluc"));
        deck.push(new Card(7, "Jean"));
        deck.push(new Card(8, "Venti"));
        deck.push(new Card(9, "Noelle"));
        deck.push(new Card(10, "Childe"));
        deck.push(new Card(11, "Zhongli"));
        deck.push(new Card(12,"Ningguang"));
        deck.push(new Card(13, "Keiqing"));
        deck.push(new Card(14, "Ganyu"));
        deck.push(new Card(15, "Qiqi"));
        deck.push(new Card(16, "Xiao"));
        deck.push(new Card(17, "Xingqiu"));
        deck.push(new Card(18, "Razor"));
        deck.push(new Card(19, "Bennett"));
        deck.push(new Card(20, "Hu Tao"));
        deck.push(new Card(21, "Fischl"));
        deck.push(new Card(22, "Klee"));
        deck.push(new Card(23, "Albedo"));
        deck.push(new Card(24, "Chongyun"));
        deck.push(new Card(25, "Ei"));
        deck.push(new Card(26, "Kokomi"));
        deck.push(new Card(27, "Rosaria"));
        deck.push(new Card(28, "Beidou"));
        deck.push(new Card(29,"Mona"));
        deck.push(new Card(30, "Ayaka"));

        Random rand = new Random();

        Scanner pause = new Scanner(System.in);

        while (!deck.isEmpty) {
            int rand_command = rand.nextInt(3) + 1;
            int rand_num = rand.nextInt(5) + 1;

            if (rand_command == 1)
            {
                System.out.println("You drew " + rand_num + " cards.");

                if (deck.getSize() <= rand_num)
                {
                    break;
                }
                else {
                    for (int i = rand_num - 1; i >= 0; i--) {
                        hand.push(deck.pop());
                    }
                }

            }
            else if (rand_command == 2)
            {
                if (hand.getSize() >= rand_num)
                {
                    System.out.println("You discarded " + rand_num + " cards.");

                    for (int i = rand_num - 1; i >= 0; i--)
                    {
                        discard.push(hand.pop());
                    }
                }
                else
                {
                    System.out.println("Insufficient number of cards on hand.");
                }

            }
            else
            {
                if (discard.getSize() >= rand_num)
                {
                   System.out.println("You got " + rand_num + " cards from the discarded pile.");

                    for (int i = rand_num - 1; i >= 0; i--)
                    {
                        hand.push(discard.pop());
                    }
                }
                else
                {
                    System.out.println("Insufficient number of cards discarded.");
                }
            }
            hand.printStack();
            System.out.println("\nCurrent no. of cards on deck: " + deck.getSize());
            System.out.println("Current no. of cards discarded: " + discard.getSize());

            pause.nextLine();
        }

        System.out.println("\nThe deck has been emptied.");

    }
}
