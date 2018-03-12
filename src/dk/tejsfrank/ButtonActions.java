package dk.tejsfrank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActions {
    Checker checker = new Checker();

    //Button funktion til at åbne main window/userview
    void openWindow(JButton jButton, String bruger, String pass){
        System.out.println("heyo");


            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Brugernavn: " + bruger);
                    System.out.println("Password: " + pass);
                    if(checker.checkerLogin(bruger,pass)==true) {

                        UserView userView = new UserView();
                        userView.openingTheUserView();
                        System.out.println("Yeah boiii"
                        );
                    }

                }
            });

    }



}
