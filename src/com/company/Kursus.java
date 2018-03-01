package com.company;

public class Kursus {
    private String navn;
    private Ugedage ugedag;
    private Kurser kurser;
    private Underviser underviser;
    private String mødetid;

    public Kursus (String navn){
        this.navn = navn;
    }
    public Kursus(String navn,Ugedage ugedag,Kurser kurser, Underviser underviser, String mødetid){
        this.navn = navn;
        this.ugedag = ugedag;
        this.kurser = kurser;
        this.underviser = underviser;
        this.mødetid = mødetid;
    }
}
