package com.company;

public class Main {

    public static void main(String[] args) {
        DB_ArrayList db_arrayList = new DB_ArrayList();
        System.out.println("hello");
        System.out.println(db_arrayList.arrayAfAlleStuderende);
        Studerende studerende1 = new Studerende("Nigga","WIth Big DICKER","yee","password");
        System.out.println(studerende1.getBrugernavn());
        db_arrayList.arrayAfAlleStuderende.add(studerende1);
        System.out.println(db_arrayList.arrayAfAlleStuderende);



    }
}
