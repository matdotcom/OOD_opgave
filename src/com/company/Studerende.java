package com.company;

import java.util.ArrayList;

public class Studerende extends Bruger {

    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String kodeord;
    ArrayList<Kursus> kursuses = new ArrayList<Kursus>();
    ArrayList<Ugedage> hvilkeDageManHarFagArrayList = new ArrayList<Ugedage>();


    public Studerende(String fornavn, String efternavn, String brugernavn, String kodeord){
        super(fornavn, efternavn, brugernavn, kodeord);
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
    }


    //Funktion til at joine et kursus.
    public void joinKursus(Studerende studerende, Kursus kursus){
        //Checker om han er tilmeldt.
        if(kursuses.contains(kursus)){
            System.out.println("Du er allerede tilmeldt dette fag.");
        }else {
            //checker om han har fag på den dag.
            if(!(hvilkeDageManHarFagArrayList.contains(kursus.getUgedag()))){
                hvilkeDageManHarFagArrayList.add(kursus.getUgedag());
                kursuses.add(kursus);
                kursus.placeStudentInArray(studerende);
                System.out.println("You have succesfully joined the kursus.");
            }else {
                System.out.println("Du har allerede et fag på den dag.");
            }
        }
    }
    //Funktion til at leave en klasse
    public void leaveKursus(Studerende studerende, Kursus kursus){
        //Checker om han er tilmeldt
        if(kursuses.contains(kursus)){
            kursus.removeStudentFromArray(studerende);
            kursuses.remove(kursus);
            System.out.println("Student succesfully removed");
        }else{
            System.out.println("You are not enrolling in this subject.");
        }
    }
}
