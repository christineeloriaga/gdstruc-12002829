package com.christineeloriaga.quiz4;

public class Main {

    public static void main(String[] args) {

        Player venti = new Player(193, "Tone-Deaf Bard", 90);
        Player zhongli = new Player(536, "OsmanthusWine", 75);
        Player baal = new Player (32, "TangoDangoMilk", 87);
        Player fischl = new Player (4931, "ItsBenefischl", 79);
        Player itto = new Player (6919, "IttoNa_IttoNa_AAAAAAA", 69);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(venti.getUserName(), venti);
        hashtable.put(zhongli.getUserName(), zhongli);
        hashtable.put(baal.getUserName(), baal);
        hashtable.put(fischl.getUserName(), fischl);
        hashtable.put(itto.getUserName(), itto);

        hashtable.remove(zhongli.getUserName(), zhongli);
        hashtable.printHashtable();

    }
}
