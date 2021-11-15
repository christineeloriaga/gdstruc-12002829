package com.christineeloriaga.quiz3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(70);

        // Repetitive names are given but id remains different

        queue.add(new Player(1,"PotatoChips"));
        queue.add(new Player(2, "PopTartartaglia"));
        queue.add(new Player(3, "BobTheBuilder"));
        queue.add(new Player(4, "OOPsie"));
        queue.add(new Player(5, "LittleMissy"));
        queue.add(new Player(6, "Gummy09"));
        queue.add(new Player(7, "YellowMallow"));

        queue.add(new Player(8,"PotatoChips"));
        queue.add(new Player(9, "PopTartartaglia"));
        queue.add(new Player(10, "BobTheBuilder"));
        queue.add(new Player(11, "OOPsie"));
        queue.add(new Player(12, "LittleMissy"));
        queue.add(new Player(13, "Gummy09"));
        queue.add(new Player(14, "YellowMallow"));

        queue.add(new Player(15,"PotatoChips"));
        queue.add(new Player(16, "PopTartartaglia"));
        queue.add(new Player(17, "BobTheBuilder"));
        queue.add(new Player(18, "OOPsie"));
        queue.add(new Player(19, "LittleMissy"));
        queue.add(new Player(20, "Gummy09"));
        queue.add(new Player(21, "YellowMallow"));

        queue.add(new Player(22,"PotatoChips"));
        queue.add(new Player(23, "PopTartartaglia"));
        queue.add(new Player(24, "BobTheBuilder"));
        queue.add(new Player(25, "OOPsie"));
        queue.add(new Player(26, "LittleMissy"));
        queue.add(new Player(27, "Gummy09"));
        queue.add(new Player(28, "YellowMallow"));

        queue.add(new Player(29,"PotatoChips"));
        queue.add(new Player(30, "PopTartartaglia"));
        queue.add(new Player(31, "BobTheBuilder"));
        queue.add(new Player(32, "OOPsie"));
        queue.add(new Player(33, "LittleMissy"));
        queue.add(new Player(34, "Gummy09"));
        queue.add(new Player(35, "YellowMallow"));

        queue.add(new Player(36,"PotatoChips"));
        queue.add(new Player(37, "PopTartartaglia"));
        queue.add(new Player(38, "BobTheBuilder"));
        queue.add(new Player(39, "OOPsie"));
        queue.add(new Player(40, "LittleMissy"));
        queue.add(new Player(41, "Gummy09"));
        queue.add(new Player(42, "YellowMallow"));

        queue.add(new Player(43,"PotatoChips"));
        queue.add(new Player(44, "PopTartartaglia"));
        queue.add(new Player(45, "BobTheBuilder"));
        queue.add(new Player(46, "OOPsie"));
        queue.add(new Player(47, "LittleMissy"));
        queue.add(new Player(48, "Gummy09"));
        queue.add(new Player(49, "YellowMallow"));

        queue.add(new Player(50,"PotatoChips"));
        queue.add(new Player(51, "PopTartartaglia"));
        queue.add(new Player(52, "BobTheBuilder"));
        queue.add(new Player(53, "OOPsie"));
        queue.add(new Player(54, "LittleMissy"));
        queue.add(new Player(55, "Gummy09"));
        queue.add(new Player(56, "YellowMallow"));

        queue.add(new Player(57,"PotatoChips"));
        queue.add(new Player(58, "PopTartartaglia"));
        queue.add(new Player(59, "BobTheBuilder"));
        queue.add(new Player(60, "OOPsie"));
        queue.add(new Player(61, "LittleMissy"));
        queue.add(new Player(62, "Gummy09"));
        queue.add(new Player(63, "YellowMallow"));

        Scanner pause = new Scanner(System.in);

        int game = 1;
        int totalQueue = 0;

        while (game < 10)
        {
            int poppedPlayer = 0;
            Random rand = new Random();
            int rand_num = rand.nextInt(7) + 1;
            totalQueue = totalQueue + rand_num;

            System.out.println("Players added: " + rand_num);
            System.out.println("Players in queue: " + totalQueue);

            if (totalQueue >= 5) {

                System.out.println("Players removed: ");

                while (true) {
                    System.out.println(queue.remove());
                    if (poppedPlayer == 4) {
                        break;
                    }

                    poppedPlayer = poppedPlayer + 1;
                }

                totalQueue = totalQueue - 5;

                game++;

            } else {
                System.out.println("Insufficient number of players.");
            }

            pause.nextLine();
        }
     }
}
