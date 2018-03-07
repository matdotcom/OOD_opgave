package dk.tejsfrank;

public class Underviser extends Bruger {

    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String kodeord;


    public Underviser(String fornavn, String efternavn, String brugernavn, String kodeord){
        super(fornavn, efternavn, brugernavn, kodeord);
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
    }
}
