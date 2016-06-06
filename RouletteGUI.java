import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * Creates, displays, and allows the user to interact with a GUI that plays the
 * game of Roulette
 * 
 * @author Matthew Vedua
 * @author Garrett Gugs
 */
public class RouletteGUI extends OurCasino {
	protected static List<JTextField> clickedOn = new ArrayList<JTextField>();
	protected static List<JTextField> board = new ArrayList<JTextField>();
	private JTextArea textArea;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField betTextField;
	private JLabel balanceLabel;
	private JTextField balanceText;
	private JButton btnStraight;
	private JButton btnSplit;
	private JButton btnStreet;
	private JButton btnSixLine;
	private JButton btnCorner;
	private JButton btnNewBet;
	private String typeOfBet;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */

	public static void run() {
		try {
			RouletteGUI window = new RouletteGUI();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public RouletteGUI() {
		initialize();
		setTextFields(false);
		btnStraight.setEnabled(false);
		btnSplit.setEnabled(false);
		btnSixLine.setEnabled(false);
		btnStreet.setEnabled(false);
		btnCorner.setEnabled(false);
		btnNewBet.setEnabled(true);
		betTextField.setEditable(false);
		btnConfirm.setEnabled(false);
		textArea.setText("Welcome to Roulette!\n\nPlease click on [New Bet] to get started.");
		balanceText.setText(balance + "");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 815, 398);
		frame.getContentPane().setLayout(null);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.RED);
		textField_2.setEditable(false);
		textField_2.setText("3");
		textField_2.setBounds(48, 30, 30, 30);
		frame.getContentPane().add(textField_2);
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_2.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_2);
					textArea.append("\nYou added Tile 3 to your bet.");
					textField_2.setEnabled(false);
				}
			}
		});

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setText("2");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(48, 60, 30, 30);
		frame.getContentPane().add(textField_1);
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_1.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_1);
					textArea.append("\nYou added Tile 2 to your bet.");
					textField_1.setEnabled(false);
				}
			}
		});

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.RED);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setText("1");
		textField.setBounds(48, 90, 30, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField);
					textArea.append("\nYou added Tile 1 to your bet.");
					textField.setEnabled(false);
				}
			}
		});

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("6");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setEditable(false);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(78, 30, 30, 30);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_3.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_3);
					textArea.append("\nYou added Tile 6 to your bet.");
					textField_3.setEnabled(false);
				}
			}
		});

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("5");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setEditable(false);
		textField_4.setBackground(Color.RED);
		textField_4.setBounds(78, 60, 30, 30);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_4.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_4);
					textArea.append("\nYou added Tile 5 to your bet.");
					textField_4.setEnabled(false);
				}
			}
		});

		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("4");
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setEditable(false);
		textField_5.setBackground(Color.BLACK);
		textField_5.setBounds(78, 90, 30, 30);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_5.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_5);
					textArea.append("\nYou added Tile 4 to your bet.");
					textField_5.setEnabled(false);
				}
			}
		});

		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("9");
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setEditable(false);
		textField_6.setBackground(Color.RED);
		textField_6.setBounds(108, 30, 30, 30);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_6.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_6);
					textArea.append("\nYou added Tile 9 to your bet.");
					textField_6.setEnabled(false);
				}
			}
		});

		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("8");
		textField_7.setForeground(Color.WHITE);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setEditable(false);
		textField_7.setBackground(Color.BLACK);
		textField_7.setBounds(108, 60, 30, 30);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_7.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_7);
					textArea.append("\nYou added Tile 8 to your bet.");
					textField_7.setEnabled(false);
				}
			}
		});

		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("7");
		textField_8.setForeground(Color.WHITE);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setEditable(false);
		textField_8.setBackground(Color.RED);
		textField_8.setBounds(108, 90, 30, 30);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_8.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_8);
					textArea.append("\nYou added Tile 7 to your bet.");
					textField_8.setEnabled(false);
				}
			}
		});

		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("12");
		textField_9.setForeground(Color.WHITE);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setEditable(false);
		textField_9.setBackground(Color.RED);
		textField_9.setBounds(137, 30, 30, 30);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		textField_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_9.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_9);
					textArea.append("\nYou added Tile 12 to your bet.");
					textField_9.setEnabled(false);
				}
			}
		});

		textField_10 = new JTextField();
		textField_10.setEnabled(true);
		textField_10.setEditable(false);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.WHITE);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setBackground(Color.BLACK);
		textField_10.setText("11");
		textField_10.setBounds(137, 60, 30, 30);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_10.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_10);
					textArea.append("\nYou added Tile 11 to your bet.");
					textField_10.setEnabled(false);
				}
			}
		});

		textField_11 = new JTextField();
		textField_11.setForeground(Color.WHITE);
		textField_11.setText("10");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_11.setEditable(false);
		textField_11.setBackground(Color.BLACK);
		textField_11.setBounds(137, 90, 30, 30);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_11.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_11);
					textArea.append("\nYou added Tile 10 to your bet.");
					textField_11.setEnabled(false);
				}
			}
		});

		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.WHITE);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_12.setBackground(Color.BLACK);
		textField_12.setEnabled(true);
		textField_12.setEditable(false);
		textField_12.setText("15");
		textField_12.setBounds(166, 30, 30, 30);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_12.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_12);
					textArea.append("\nYou added Tile 15 to your bet.");
					textField_12.setEnabled(false);
				}
			}
		});

		textField_13 = new JTextField();
		textField_13.setForeground(Color.WHITE);
		textField_13.setText("14");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_13.setEditable(false);
		textField_13.setBackground(Color.RED);
		textField_13.setBounds(166, 60, 30, 30);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_13.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_13);
					textArea.append("\nYou added Tile 14 to your bet.");
					textField_13.setEnabled(false);
				}
			}
		});

		textField_14 = new JTextField();
		textField_14.setText("13");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setForeground(Color.WHITE);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_14.setEditable(false);
		textField_14.setBackground(Color.BLACK);
		textField_14.setBounds(166, 90, 30, 30);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_14.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_14);
					textArea.append("\nYou added Tile 13 to your bet.");
					textField_14.setEnabled(false);
				}
			}
		});

		textField_15 = new JTextField();
		textField_15.setText("18");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setForeground(Color.WHITE);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_15.setEditable(false);
		textField_15.setBackground(Color.RED);
		textField_15.setBounds(195, 30, 30, 30);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_15.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_15);
					textArea.append("\nYou added Tile 18 to your bet.");
					textField_15.setEnabled(false);
				}
			}
		});

		textField_16 = new JTextField();
		textField_16.setText("17");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(Color.WHITE);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_16.setEditable(false);
		textField_16.setBackground(Color.BLACK);
		textField_16.setBounds(195, 60, 30, 30);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_16.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_16);
					textArea.append("\nYou added Tile 17 to your bet.");
					textField_16.setEnabled(false);
				}
			}
		});

		textField_17 = new JTextField();
		textField_17.setText("16");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setForeground(Color.WHITE);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_17.setEditable(false);
		textField_17.setBackground(Color.RED);
		textField_17.setBounds(195, 90, 30, 30);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_17.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_17);
					textArea.append("\nYou added Tile 16 to your bet.");
					textField_17.setEnabled(false);
				}
			}
		});

		textField_18 = new JTextField();
		textField_18.setText("21");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setForeground(Color.WHITE);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_18.setEditable(false);
		textField_18.setBackground(Color.RED);
		textField_18.setBounds(224, 30, 30, 30);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_18.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_18);
					textArea.append("\nYou added Tile 21 to your bet.");
					textField_18.setEnabled(false);
				}
			}
		});

		textField_19 = new JTextField();
		textField_19.setText("20");
		textField_19.setForeground(Color.WHITE);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_19.setEditable(false);
		textField_19.setBackground(Color.BLACK);
		textField_19.setBounds(224, 60, 30, 30);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_19.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_19);
					textArea.append("\nYou added Tile 20 to your bet.");
					textField_19.setEnabled(false);
				}
			}
		});

		textField_20 = new JTextField();
		textField_20.setText("19");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setForeground(Color.WHITE);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_20.setEditable(false);
		textField_20.setBackground(Color.RED);
		textField_20.setBounds(224, 90, 30, 30);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_20.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_20);
					textArea.append("\nYou added Tile 19 to your bet.");
					textField_20.setEnabled(false);
				}
			}
		});

		textField_21 = new JTextField();
		textField_21.setText("24");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setForeground(Color.WHITE);
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_21.setEditable(false);
		textField_21.setBackground(Color.BLACK);
		textField_21.setBounds(253, 30, 30, 30);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_21.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_21);
					textArea.append("\nYou added Tile 24 to your bet.");
					textField_21.setEnabled(false);
				}
			}
		});

		textField_22 = new JTextField();
		textField_22.setText("23");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setForeground(Color.WHITE);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_22.setEditable(false);
		textField_22.setBackground(Color.RED);
		textField_22.setBounds(253, 60, 30, 30);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_22.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_22);
					textArea.append("\nYou added Tile 23 to your bet.");
					textField_22.setEnabled(false);
				}
			}
		});

		textField_23 = new JTextField();
		textField_23.setText("22");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setForeground(Color.WHITE);
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_23.setEditable(false);
		textField_23.setBackground(Color.BLACK);
		textField_23.setBounds(253, 90, 30, 30);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_23.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_23);
					textArea.append("\nYou added Tile 22 to your bet.");
					textField_23.setEnabled(false);
				}
			}
		});

		textField_24 = new JTextField();
		textField_24.setText("27");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setForeground(Color.WHITE);
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_24.setEditable(false);
		textField_24.setBackground(Color.RED);
		textField_24.setBounds(282, 30, 30, 30);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_24.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_24);
					textArea.append("\nYou added Tile 27 to your bet.");
					textField_24.setEnabled(false);
				}
			}
		});

		textField_25 = new JTextField();
		textField_25.setText("26");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setForeground(Color.WHITE);
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_25.setEditable(false);
		textField_25.setBackground(Color.BLACK);
		textField_25.setBounds(282, 60, 30, 30);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		textField_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_25.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_25);
					textArea.append("\nYou added Tile 26 to your bet.");
					textField_25.setEnabled(false);
				}
			}
		});

		textField_26 = new JTextField();
		textField_26.setText("25");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setForeground(Color.WHITE);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_26.setEditable(false);
		textField_26.setBackground(Color.RED);
		textField_26.setBounds(282, 90, 30, 30);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		textField_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_26.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_26);
					textArea.append("\nYou added Tile 25 to your bet.");
					textField_26.setEnabled(false);
				}
			}
		});

		textField_27 = new JTextField();
		textField_27.setText("30");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setForeground(Color.WHITE);
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_27.setEditable(false);
		textField_27.setBackground(Color.RED);
		textField_27.setBounds(311, 30, 30, 30);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		textField_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_27.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_27);
					textArea.append("\nYou added Tile 30 to your bet.");
					textField_27.setEnabled(false);
				}
			}
		});

		textField_28 = new JTextField();
		textField_28.setText("29");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setForeground(Color.WHITE);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_28.setEditable(false);
		textField_28.setBackground(Color.BLACK);
		textField_28.setBounds(311, 60, 30, 30);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		textField_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_28.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_28);
					textArea.append("\nYou added Tile 29 to your bet.");
					textField_28.setEnabled(false);
				}
			}
		});

		textField_29 = new JTextField();
		textField_29.setText("28");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setForeground(Color.WHITE);
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_29.setEditable(false);
		textField_29.setBackground(Color.BLACK);
		textField_29.setBounds(311, 90, 30, 30);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		textField_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_29.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_29);
					textArea.append("\nYou added Tile 28 to your bet.");
					textField_29.setEnabled(false);
				}
			}
		});

		textField_30 = new JTextField();
		textField_30.setText("33");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setForeground(Color.WHITE);
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_30.setEditable(false);
		textField_30.setBackground(Color.BLACK);
		textField_30.setBounds(340, 30, 30, 30);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		textField_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_30.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_30);
					textArea.append("\nYou added Tile 33 to your bet.");
					textField_30.setEnabled(false);
				}
			}
		});

		textField_31 = new JTextField();
		textField_31.setText("32");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setForeground(Color.WHITE);
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_31.setEditable(false);
		textField_31.setBackground(Color.RED);
		textField_31.setBounds(340, 60, 30, 30);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		textField_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_31.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_31);
					textArea.append("\nYou added Tile 32 to your bet.");
					textField_31.setEnabled(false);
				}
			}
		});

		textField_32 = new JTextField();
		textField_32.setText("31");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setForeground(Color.WHITE);
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_32.setEditable(false);
		textField_32.setBackground(Color.BLACK);
		textField_32.setBounds(340, 90, 30, 30);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);
		textField_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_32.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_32);
					textArea.append("\nYou added Tile 31 to your bet.");
					textField_32.setEnabled(false);
				}
			}
		});

		textField_33 = new JTextField();
		textField_33.setText("36");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setForeground(Color.WHITE);
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_33.setEditable(false);
		textField_33.setBackground(Color.RED);
		textField_33.setBounds(369, 30, 30, 30);
		frame.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		textField_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_33.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_33);
					textArea.append("\nYou added Tile 36 to your bet.");
					textField_33.setEnabled(false);
				}
			}
		});

		textField_34 = new JTextField();
		textField_34.setText("35");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setForeground(Color.WHITE);
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_34.setEditable(false);
		textField_34.setBackground(Color.BLACK);
		textField_34.setBounds(369, 60, 30, 30);
		frame.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		textField_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_34.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_34);
					textArea.append("\nYou added Tile 35 to your bet.");
					textField_34.setEnabled(false);
				}
			}
		});

		textField_35 = new JTextField();
		textField_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textField_35.isEnabled()) {
					RouletteHelperMethods.clickedOn.add(textField_35);
					textArea.append("\nYou added Tile 34 to your bet.");
					textField_35.setEnabled(false);
				}
			}
		});
		textField_35.setText("34");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setForeground(Color.WHITE);
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_35.setEditable(false);
		textField_35.setBackground(Color.RED);
		textField_35.setBounds(369, 90, 30, 30);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);

		btnStraight = new JButton("Straight");
		btnStraight.setToolTipText("Odds - 35:1");
		btnStraight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("Click on 1 tile to bet on.\n");
				typeOfBet = "Straight";
				btnConfirm.setEnabled(true);
				btnNewBet.setEnabled(false);
				btnStraight.setEnabled(false);
				btnSplit.setEnabled(false);
				btnSixLine.setEnabled(false);
				btnStreet.setEnabled(false);
				btnCorner.setEnabled(false);
				setTextFields(true);
			}
		});
		btnStraight.setBounds(50, 223, 88, 23);
		frame.getContentPane().add(btnStraight);

		btnSplit = new JButton("Split");
		btnSplit.setToolTipText("Odds - 17:1");
		btnSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Click on 2 adjacent tiles to bet on.");
				textArea.append("\nExample: 5, 6 or 14, 17\n");
				typeOfBet = "Split";
				btnConfirm.setEnabled(true);
				btnNewBet.setEnabled(false);
				btnStraight.setEnabled(false);
				btnSplit.setEnabled(false);
				btnSixLine.setEnabled(false);
				btnStreet.setEnabled(false);
				btnCorner.setEnabled(false);
				setTextFields(true);
			}
		});
		btnSplit.setBounds(50, 257, 88, 23);
		frame.getContentPane().add(btnSplit);

		btnStreet = new JButton("Street");
		btnStreet.setToolTipText("Odds - 11:1");
		btnStreet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Click on 3 consecutive numbers in a vertical line");
				textArea.append("\nExample: 7, 8, 9\n");
				typeOfBet = "Street";
				btnConfirm.setEnabled(true);
				btnNewBet.setEnabled(false);
				btnStraight.setEnabled(false);
				btnSplit.setEnabled(false);
				btnSixLine.setEnabled(false);
				btnStreet.setEnabled(false);
				btnCorner.setEnabled(false);
				setTextFields(true);
			}
		});
		btnStreet.setBounds(50, 291, 89, 23);
		frame.getContentPane().add(btnStreet);

		btnCorner = new JButton("Square");
		btnCorner.setToolTipText("Odds - 8:1");
		btnCorner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Click on 4 numbers that complete a square.");
				textArea.append("\nExample: 10, 11, 13, 14\n");
				typeOfBet = "Square";
				btnConfirm.setEnabled(true);
				btnNewBet.setEnabled(false);
				btnStraight.setEnabled(false);
				btnSplit.setEnabled(false);
				btnSixLine.setEnabled(false);
				btnStreet.setEnabled(false);
				btnCorner.setEnabled(false);
				setTextFields(true);
			}
		});
		btnCorner.setBounds(148, 223, 89, 23);
		frame.getContentPane().add(btnCorner);

		btnSixLine = new JButton("Six Line");
		btnSixLine.setToolTipText("Odds - 5:1");
		btnSixLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Click on 6 consecutive numbers that form two vertical lines.");
				textArea.append("\nExample: 31,32,33,34,35,36\n");
				typeOfBet = "Six Line";
				btnConfirm.setEnabled(true);
				btnNewBet.setEnabled(false);
				btnStraight.setEnabled(false);
				btnSplit.setEnabled(false);
				btnSixLine.setEnabled(false);
				btnStreet.setEnabled(false);
				btnCorner.setEnabled(false);
				setTextFields(true);
			}
		});
		btnSixLine.setBounds(148, 257, 89, 23);
		frame.getContentPane().add(btnSixLine);

		JLabel lblBet = new JLabel("Bet:");
		lblBet.setForeground(Color.WHITE);
		lblBet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBet.setBounds(264, 220, 59, 22);
		frame.getContentPane().add(lblBet);

		textArea = new JTextArea();
		textArea.setForeground(Color.GREEN);
		textArea.setBackground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(425, 30, 333, 284);
		frame.getContentPane().add(textArea);

		btnNewBet = new JButton("New Bet");
		btnNewBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (balance == 0) {
					textArea.setText("You ran out of money :(\nGo back to the main menu to reset it!");
				} else {
					RouletteHelperMethods.clickedOn.clear();
					setTextFields(false);
					btnConfirm.setEnabled(false);
					btnStraight.setEnabled(false);
					btnSplit.setEnabled(false);
					btnSixLine.setEnabled(false);
					btnStreet.setEnabled(false);
					btnCorner.setEnabled(false);
					btnNewBet.setEnabled(false);
					betTextField.setEditable(true);
					textArea.setText("Please enter your bet.");
				}
			}
		});
		btnNewBet.setBounds(326, 291, 89, 23);
		frame.getContentPane().add(btnNewBet);

		betTextField = new JTextField();
		betTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bet = Integer.parseInt(betTextField.getText());
				if (bet > balance) {
					textArea.setText("You bet more than your balance.\nLower your bet.");
				} else {
					btnStraight.setEnabled(true);
					btnSplit.setEnabled(true);
					btnSixLine.setEnabled(true);
					btnStreet.setEnabled(true);
					btnCorner.setEnabled(true);
					textArea.setText("Choose what type of bet to do.");
				}
			}
		});
		betTextField.setBounds(327, 223, 88, 22);
		frame.getContentPane().add(betTextField);
		betTextField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Welcome to Roulette");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 46));
		lblNewLabel.setBounds(48, 134, 349, 78);
		frame.getContentPane().add(lblNewLabel);

		balanceLabel = new JLabel("Balance:");
		balanceLabel.setForeground(Color.WHITE);
		balanceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		balanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		balanceLabel.setBounds(253, 261, 70, 14);
		frame.getContentPane().add(balanceLabel);

		balanceText = new JTextField();
		balanceText.setEditable(false);
		balanceText.setBounds(327, 258, 86, 20);
		frame.getContentPane().add(balanceText);
		balanceText.setColumns(10);

		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (RouletteHelperMethods.checkNumTiles(typeOfBet)) {
					btnStraight.setEnabled(false);
					btnSplit.setEnabled(false);
					btnSixLine.setEnabled(false);
					btnStreet.setEnabled(false);
					btnCorner.setEnabled(false);
					btnNewBet.setEnabled(true);
					betTextField.setEditable(false);
					btnConfirm.setEnabled(false);
					if (RouletteHelperMethods.doBet(typeOfBet) == 1) {
						textArea.append("\n\nCongrats, you won!");
						textArea.append("\nThe winning tile was: " + RouletteHelperMethods.getRandomTile());
					} else {
						textArea.append("\n\nSorry, you lost.");
						textArea.append("\nThe winning tile was: " + RouletteHelperMethods.getRandomTile());
					}
					btnNewBet.setEnabled(true);
					balanceText.setText(balance + "");
				} else {
					textArea.append("\nYou did not bet on the correct number of tiles.");
					textArea.append("\nYou are supposed to bet on " + RouletteHelperMethods.tilesForBet(typeOfBet)
							+ " for " + typeOfBet);
					textArea.append("\nIf you bet too many tiles, press [New Bet]");
					btnNewBet.setEnabled(true);
				}
			}
		});
		btnConfirm.setBounds(148, 291, 89, 23);
		frame.getContentPane().add(btnConfirm);

	}

	/**
	 * Eliminates repitition for enabling/disabling the JTextFields
	 * 
	 * @param whatToSet
	 *            A boolean variable to decide if the textfields should be
	 *            enabled
	 */
	private void setTextFields(boolean whatToSet) {
		textField.setEnabled(whatToSet);
		textField_1.setEnabled(whatToSet);
		textField_2.setEnabled(whatToSet);
		textField_3.setEnabled(whatToSet);
		textField_4.setEnabled(whatToSet);
		textField_5.setEnabled(whatToSet);
		textField_6.setEnabled(whatToSet);
		textField_7.setEnabled(whatToSet);
		textField_8.setEnabled(whatToSet);
		textField_9.setEnabled(whatToSet);
		textField_10.setEnabled(whatToSet);
		textField_11.setEnabled(whatToSet);
		textField_12.setEnabled(whatToSet);
		textField_13.setEnabled(whatToSet);
		textField_14.setEnabled(whatToSet);
		textField_15.setEnabled(whatToSet);
		textField_16.setEnabled(whatToSet);
		textField_17.setEnabled(whatToSet);
		textField_18.setEnabled(whatToSet);
		textField_19.setEnabled(whatToSet);
		textField_20.setEnabled(whatToSet);
		textField_21.setEnabled(whatToSet);
		textField_22.setEnabled(whatToSet);
		textField_23.setEnabled(whatToSet);
		textField_24.setEnabled(whatToSet);
		textField_25.setEnabled(whatToSet);
		textField_26.setEnabled(whatToSet);
		textField_27.setEnabled(whatToSet);
		textField_28.setEnabled(whatToSet);
		textField_29.setEnabled(whatToSet);
		textField_30.setEnabled(whatToSet);
		textField_31.setEnabled(whatToSet);
		textField_32.setEnabled(whatToSet);
		textField_33.setEnabled(whatToSet);
		textField_34.setEnabled(whatToSet);
		textField_35.setEnabled(whatToSet);
	}
}
