package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        DB_ArrayList db_arrayList = new DB_ArrayList();

        //Nye studerende
        Studerende jens = new Studerende("Jens","Hansen","Jenseren","password");
        Studerende hans = new Studerende("Hans","Reakd","Sheif","password123");

        //ny Underviser
        Underviser frank = new Underviser("frank","Hansen","reall","123456");


        //Nye kurser
        Kursus dildplukning = new Kursus("Dildplukning", Ugedage.fredag,FagType.VAERKSTED,frank, "halv 8." );
        Kursus næsepildning = new Kursus("NæsePildning", Ugedage.fredag,FagType.SPROG,frank,"Her og Nu.");

        //Students joiner et fag.
        jens.joinKursus(jens,dildplukning);
        hans.joinKursus(hans,dildplukning);

        jens.joinKursus(jens,næsepildning);

        System.out.println(næsepildning.studerendeIKursusArrayList);


        System.out.println(dildplukning.studerendeIKursusArrayList);
        System.out.println(dildplukning.getUnderviser());

        //Studenter leaver et fag
        jens.leaveKursus(jens,dildplukning);

        System.out.println(dildplukning.studerendeIKursusArrayList);
        System.out.println(dildplukning.getUnderviser());




    }
}
