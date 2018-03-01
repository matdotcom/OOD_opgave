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

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Ugedage getUgedag() {
        return ugedag;
    }

    public void setUgedag(Ugedage ugedag) {
        this.ugedag = ugedag;
    }

    public Kurser getKurser() {
        return kurser;
    }

    public void setKurser(Kurser kurser) {
        this.kurser = kurser;
    }

    public Underviser getUnderviser() {
        return underviser;
    }

    public void setUnderviser(Underviser underviser) {
        this.underviser = underviser;
    }

    public String getMødetid() {
        return mødetid;
    }

    public void setMødetid(String mødetid) {
        this.mødetid = mødetid;
    }
}
