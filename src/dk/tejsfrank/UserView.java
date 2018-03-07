package dk.tejsfrank;

import javax.swing.*;
import java.util.ArrayList;

public class UserView {

    void openingTheUserView(){
        JFrame frame = new JFrame("Velkommen til skoleApplikationen.");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

    }

    void placeComponents(JPanel panel){
        //Skal ændres til elevens navn
        JLabel userLabel = new JLabel("Velkommen");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        //display tilmeldte fag.






    }


    ArrayList<Kursus> hentSkemaKursus(Studerende studerende){
        return studerende.kursuses;
    }


    ArrayList<Ugedage> hentSkemaDage(Studerende studerende){
        return studerende.hvilkeDageManHarFagArrayList;
    }







}
