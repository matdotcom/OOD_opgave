package com.company;

public class Studerende extends Bruger {

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


    public void joinKursus(Studerende studerende,Kursus kursus){

        System.out.println("YOu have succesfully joined the kursus;");
    }
}
