package com.company;

public class Kursus {
    private String navn;
    private Ugedage ugedag;
    private Underviser underviser;
    private String mødetid;
    private FagType fagType;

    public Kursus (String navn){
        this.navn = navn;
    }
    public Kursus(String navn,Ugedage ugedag,FagType fagType, Underviser underviser, String mødetid){
        this.navn = navn;
        this.ugedag = ugedag;
        this.fagType = fagType;
        this.underviser = underviser;
        this.mødetid = mødetid;
        System.out.println("Kursus : " + navn + " Oprettet.");
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

    public FagType getFagtype() {
        return fagType;
    }

    public void setFagType(FagType fagType) {
        this.fagType = fagType;
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
