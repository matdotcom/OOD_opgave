package com.company;

public abstract class System {
    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String kodeord;

    public System (){}

    public System(String fornavn, String efternavn, String brugernavn, String kodeord) {
        this.fornavn = fornavn;
        this.efternavn= efternavn;
        this.brugernavn=brugernavn;
        this.kodeord=kodeord;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getKodeord() {
        return kodeord;
    }

    public void setKodeord(String kodeord) {
        this.kodeord = kodeord;
    }
}
