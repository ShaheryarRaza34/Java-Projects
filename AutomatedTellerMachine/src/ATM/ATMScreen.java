package ATM;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;

public class ATMScreen {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMScreen window = new ATMScreen();
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
	public ATMScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Moneyatre");
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel innerPanel = new JPanel();
		innerPanel.setBackground(new Color(75, 0, 130));
		innerPanel.setLayout(new BorderLayout(0, 0));
		
		
		//Welcome Label
		JLabel welcomeLabel = new JLabel("Welcome to Moneyatre");
		welcomeLabel.setVerticalAlignment(SwingConstants.TOP);
		welcomeLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		welcomeLabel.setForeground(new Color(255, 255, 255));
		welcomeLabel.setBackground(new Color(75, 0, 130));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		innerPanel.add(welcomeLabel,BorderLayout.CENTER);
		
		//Title Label
		
		JLabel lblNewLabel_2 = new JLabel("Moneyatre");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		innerPanel.add(lblNewLabel_2, BorderLayout.NORTH);
		
		
		//username and password Panel
		JPanel id_and_pass_panel = new JPanel();
		id_and_pass_panel.setForeground(new Color(255, 255, 255));
		id_and_pass_panel.setBackground(new Color(75, 0, 130));
		id_and_pass_panel.setLayout(new GridLayout(2, 2, 2, 0));
		
		JLabel accountNumberLabel = new JLabel("Account Number:");
		accountNumberLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		accountNumberLabel.setForeground(new Color(255, 255, 255));
		id_and_pass_panel.add(accountNumberLabel);
		
		JTextField accountNumberInput = new JTextField("AccountNumber");
		accountNumberInput.setForeground(Color.DARK_GRAY);
		accountNumberInput.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		accountNumberInput.setEnabled(false);
		accountNumberInput.setDisabledTextColor(Color.DARK_GRAY);
		accountNumberInput.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	accountNumberInput.setEnabled(true);
                accountNumberInput.setText("");
            }
        });
		accountNumberInput.setBackground(new Color(192, 192, 192));
		accountNumberInput.setColumns(0);
		id_and_pass_panel.add(accountNumberInput);
		
		JLabel passwordLabel = new JLabel("PINCODE:");
		passwordLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		passwordLabel.setForeground(new Color(255, 255, 255));
		id_and_pass_panel.add(passwordLabel);
		
		JTextField passwordInput = new JTextField("Please Enter 4 digit PIN CODE");
		passwordInput.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		passwordInput.setForeground(Color.DARK_GRAY);
		passwordInput.setEnabled(false);
		passwordInput.setDisabledTextColor(Color.DARK_GRAY);
		passwordInput.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	passwordInput.setEnabled(true);
                passwordInput.setText("");
            }
        });
		passwordInput.setBackground(new Color(192, 192, 192));
		passwordInput.setColumns(1);
		passwordInput.setHorizontalAlignment(SwingConstants.LEFT);
		id_and_pass_panel.add(passwordInput);
		
		
		//OUTER PANE Addition
		panel.add(innerPanel, BorderLayout.NORTH);
		panel.add(id_and_pass_panel,BorderLayout.CENTER);
		
		
	}
}
