package com.company;

public class Underviser extends Bruger {

    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String kodeord;

    DB_ArrayList db_arrayList = new DB_ArrayList();

    public Underviser(String fornavn, String efternavn, String brugernavn, String kodeord){
        super(fornavn, efternavn, brugernavn, kodeord);
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
        Underviser underviser  = new Underviser(fornavn, efternavn, brugernavn, kodeord);
        db_arrayList.arrayAfAlleUndervisere.add(underviser);
    }
}
