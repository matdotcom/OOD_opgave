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

        Underviser underviser = new Underviser("Ni2gga","WIth Big DICKER","yee","qpowe");
        System.out.println(db_arrayList.arrayAfAlleUndervisere.add(underviser));
        System.out.println(db_arrayList.arrayAfAlleUndervisere);

        Kursus kursus = new Kursus("DIld plukning 101", Ugedage.onsdag,FagType.VAERKSTED,underviser,"80:30");
        db_arrayList.arrayAfAlleKursus.add(kursus);
        Kursus kursus1 = new Kursus("DIld plukning 102", Ugedage.onsdag,FagType.VAERKSTED,underviser,"80:30");
        db_arrayList.arrayAfAlleKursus.add(kursus1);
        System.out.println(db_arrayList.arrayAfAlleKursus);



    }
}
