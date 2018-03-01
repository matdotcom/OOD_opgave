package com.company;

public class Studerende extends Bruger {
    DB_ArrayList db_arrayList = new DB_ArrayList();

    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String kodeord;

    public Studerende(String fornavn, String efternavn, String brugernavn, String kodeord){
        super(fornavn, efternavn, brugernavn, kodeord);
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
    }

}
