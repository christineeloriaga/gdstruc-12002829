package com.christineeloriaga.module5;

public class Main {

    public static void main(String[] args) {

        Player amber = new Player(193, "Baron Bunny", 90);
        Player hutao = new Player(536, "Walnut", 75);
        Player qiqi = new Player (32, "ZombieMilk", 87);
        Player kokomi = new Player (4931, "Kokonut", 79);
        Player tartaglia = new Player (6919, "RichChilde", 69);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(amber.getUserName(), amber);
        hashtable.put(hutao.getUserName(), hutao);
        hashtable.put(qiqi.getUserName(), qiqi);
        hashtable.put(kokomi.getUserName(), kokomi);
        hashtable.put(tartaglia.getUserName(), tartaglia);

        // hashtable.printHashtable();
        System.out.println(hashtable.get("RichChilde"));;
    }
}


// Amber (Baron Bunny), HuTao (Walnut), Qiqi (ZombieMilk), Kokomi (Kokonut), Tartaglia(RichChilde)
