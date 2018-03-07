package dk.tejsfrank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActions {

    //Button funktion til at åbne main window/userview
    void openWindow(JButton jButton){
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserView userView = new UserView();
                userView.openingTheUserView();


                
            }
        });

    }



}
