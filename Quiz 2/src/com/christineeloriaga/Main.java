package com.christineeloriaga;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Kaeya", 90));
        playerList.add(new Player(2, "Diluc", 70));
        playerList.add(new Player(3, "Venti", 52));

        // Answer for No. 1

        playerList.remove(1);
            for (Player p : playerList)
            {
                System.out.println(p);
         }

        // Answer for No. 2

        System.out.print(playerList.size());

        // Answer for No. 3

        System.out.print(playerList.contains(new Player(3,"Venti", 52)));
        System.out.println("\n" + playerList.indexOf(new Player(3,"Venti", 52)));
    }
}