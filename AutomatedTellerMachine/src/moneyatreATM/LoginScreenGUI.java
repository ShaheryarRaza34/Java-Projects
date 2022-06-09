package moneyatreATM;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
//import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;

public class LoginScreenGUI {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreenGUI window = new LoginScreenGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreenGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Moneyatre");
		frame.setAutoRequestFocus(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 467, 217);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		frame.getContentPane().add(panel);
		
		JPanel innerPanel = new JPanel();
		innerPanel.setForeground(Color.WHITE);
		innerPanel.setBounds(0, 0, 467, 51);
		innerPanel.setBackground(Color.WHITE);
		innerPanel.setLayout(null);
		
		
		//Welcome Label
		JLabel welcomeLabel = new JLabel("Welcome to Moneyatre");
		welcomeLabel.setBounds(102, 23, 268, 19);
		welcomeLabel.setVerticalAlignment(SwingConstants.TOP);
		welcomeLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		welcomeLabel.setForeground(new Color(75, 0, 130));
		welcomeLabel.setBackground(Color.WHITE);
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		innerPanel.add(welcomeLabel);
		
		//Title Label
		
		JLabel lblNewLabel_2 = new JLabel("Moneyatre");
		lblNewLabel_2.setBounds(102, 0, 255, 23);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(75,0,130));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		innerPanel.add(lblNewLabel_2);
		
		
		//username and password Panel
		JPanel id_and_pass_submit_panel = new JPanel();
		id_and_pass_submit_panel.setBounds(0, 50, 467, 167);
		id_and_pass_submit_panel.setForeground(new Color(255, 255, 255));
		id_and_pass_submit_panel.setBackground(new Color(75, 0, 130));
		id_and_pass_submit_panel.setLayout(null);
		
		JLabel accountNumberLabel = new JLabel("Account Number:");
		accountNumberLabel.setSize(136, 30);
		accountNumberLabel.setLocation(10, 26);
		accountNumberLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		accountNumberLabel.setForeground(new Color(255, 255, 255));
		id_and_pass_submit_panel.add(accountNumberLabel);
		
		JTextField accountNumberInput = new JTextField("Please enter your AccountNumber");
		accountNumberInput.setEnabled(false);
		accountNumberInput.setHorizontalAlignment(SwingConstants.CENTER);
		accountNumberInput.setSize(278, 20);
		accountNumberInput.setLocation(146, 29);
		accountNumberInput.setForeground(Color.DARK_GRAY);
		accountNumberInput.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		accountNumberInput.setDisabledTextColor(Color.DARK_GRAY);
		accountNumberInput.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	accountNumberInput.setEnabled(true);
                accountNumberInput.setText("");
            }
        });
		accountNumberInput.setBackground(Color.WHITE);
		accountNumberInput.setColumns(0);
		id_and_pass_submit_panel.add(accountNumberInput);
		
		JLabel passwordLabel = new JLabel("4-digit PINCODE:");
		passwordLabel.setSize(136, 30);
		passwordLabel.setLocation(10, 67);
		passwordLabel.setBackground(Color.WHITE);
		passwordLabel.setIcon(null);
		passwordLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		passwordLabel.setForeground(Color.WHITE);
		id_and_pass_submit_panel.add(passwordLabel);
		
		JPasswordField passwordInput = new JPasswordField("");
		passwordInput.setEnabled(false);
		passwordInput.setSize(278, 20);
		passwordInput.setLocation(146, 72);
		passwordInput.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		passwordInput.setForeground(Color.DARK_GRAY);
		passwordInput.setDisabledTextColor(Color.DARK_GRAY);
		passwordInput.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	passwordInput.setEnabled(true);
                passwordInput.setText("");
            }
        });
		passwordInput.setBackground(Color.WHITE);
		passwordInput.setColumns(1);
		passwordInput.setHorizontalAlignment(SwingConstants.CENTER);
		id_and_pass_submit_panel.add(passwordInput);
		
		//submit button
		JButton verify = new JButton("Submit");
		verify.setHorizontalAlignment(SwingConstants.LEFT);
		verify.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		verify.setForeground(new Color(75, 0, 130));
		verify.setBackground(Color.WHITE);
		verify.setFocusPainted(false);
		verify.setBounds(350, 103, 74, 22);
		verify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Moneyatre.verify(accountNumberInput.getText(), Integer.parseInt(passwordInput.getText()));
			}
		});
		
		 
		id_and_pass_submit_panel.add(verify);
		panel.setLayout(null);
		
		
		
		
		
		//OUTER PANE Addition
		panel.add(innerPanel);
		
		JLabel close = new JLabel("X");
		close.setForeground(new Color(75, 0, 130));
		close.setFont(new Font("Tw Cen MT", Font.BOLD, 34));
		close.setHorizontalAlignment(SwingConstants.CENTER);
		close.setBounds(434, 2, 23, 19);
		close.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		innerPanel.add(close);
		panel.add(id_and_pass_submit_panel);
		
		
		
		
		
	}
}
