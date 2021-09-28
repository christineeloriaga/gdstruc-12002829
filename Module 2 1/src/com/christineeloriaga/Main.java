package com.christineeloriaga;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Kaeya", 100));
        playerList.add(new Player(2, "Diluc", 205));
        playerList.add(new Player(3, "Venti", 34));

//        System.out.println(playerList.get(1));

        playerList.add(2, new Player(553, "Klee", 55));

        playerList.remove(2);

        //System.out.println(playerList.contains(new Player(2, "Diluc", 205)));
        System.out.println(playerList.indexOf(new Player(2, "Diluc", 205)));

 //     for (Player p : playerList)
  //    {
  //          System.out.println(p);
   //    }
    }
}
