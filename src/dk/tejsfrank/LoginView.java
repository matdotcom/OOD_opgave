package dk.tejsfrank;

import javax.swing.*;

public class LoginView {


	void openLoginScreen(){
		JFrame frame = new JFrame("Login skærm");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);

	}

	private static void placeComponents(JPanel panel) {
		ButtonActions buttonActions = new ButtonActions();
		//DB_ArrayList db_arrayList = new DB_ArrayList();
		KnapperMethoder knapperMethoder = new KnapperMethoder();

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);


		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
		System.out.println(passwordText.getPassword());

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);

		//Klik på login knappen
		buttonActions.openWindow(loginButton);
		

	}

}