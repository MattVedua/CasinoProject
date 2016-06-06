import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OurCasino {
	protected static int bet, balance = 100;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurCasino window = new OurCasino();
					window.frame.setVisible(true);
					balance = 100;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OurCasino() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(41,128,185));
		frame.setForeground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 740, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Casino!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 704, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Blackjack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlackjackGUI.run();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 21));
		btnNewButton.setBounds(578, 150, 136, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Roulette");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RouletteGUI.run();
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.PLAIN, 21));
		btnNewButton_1.setBounds(10, 150, 136, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Where do you want to go?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(20, 75, 694, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea openingText = new JTextArea();
		openingText.setEditable(false);
		openingText.setToolTipText("Hurry up and PICK already!");
		openingText.setBackground(new Color(236,240,241));
		openingText.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		openingText.setBounds(156, 128, 412, 122);
		openingText.setText("In either game, you will start with $100.\r\nIf you want to switch games, you keep your money!\r\nTo switch, just close your current game.\r\n\r\nGood luck, don't go bankrupt!\r\n\r\nAuthors: Matthew Vedua & Garrett Guglielmetti\r\n");
		frame.getContentPane().add(openingText);
		
		JButton btnResetMoneyTo = new JButton("Reset Money");
		btnResetMoneyTo.setToolTipText("Resets your balance to $100");
		btnResetMoneyTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance = 100;
			}
		});
		btnResetMoneyTo.setBounds(10, 227, 136, 23);
		frame.getContentPane().add(btnResetMoneyTo);
		
		JButton btnNewButton_2 = new JButton("Reset Money");
		btnNewButton_2.setToolTipText("Resets your balance to $100");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance = 100;
			}
		});
		btnNewButton_2.setBounds(578, 227, 136, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
