import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class BlackjackGUI extends OurCasino {

    static JLabel lblUserValue;
    static JLabel lblDealerValue;
    static JButton btnHit;
    static JButton btnNewHand;
    static JButton btnStand;
    static JButton btnSurrender;
    static JButton btnDoubleDown;
    private JFrame frame;
    private JTextField txUserCards;
    private JTextField txDealerCards;
    private static JTextField txBet;
    private static JTextArea blackjackTextArea;
    private static JTextField txBalance;
    private static JLabel lblNewLabel;

    /**
     * Launch the application.
     */

    public static void run() {
        try {
            BlackjackGUI window = new BlackjackGUI();
            window.frame.setVisible(true);
            txBet.setEditable(false);
            btnHit.setEnabled(false);
            btnStand.setEnabled(false);
            btnSurrender.setEnabled(false);
            btnDoubleDown.setEnabled(false);
            blackjackTextArea.setText("Welcome to Blackjack.\n\nPress [New Hand] to begin.");
            txBalance.setText("" + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the application.
     */
    public BlackjackGUI() {
        initialize();

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 128, 0));
        frame.setBounds(100, 100, 710, 299);
        frame.getContentPane().setLayout(null);

        btnStand = new JButton("Stand");
        btnStand.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnStand.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnHit.setEnabled(false);
                    btnStand.setEnabled(false);
                    btnSurrender.setEnabled(false);
                    btnDoubleDown.setEnabled(false);
                    BlackjackHand.hitDealer();
                    txDealerCards.setText(BlackjackHand.printDealerHand());
                    lblDealerValue.setText("Value: " + BlackjackHand.calcHand("dealer"));
                    int winner = BlackjackHand.checkWinner();
                    switch (winner) {
                        case 0:
                        blackjackTextArea.setText("Sorry, you bust!\n");
                        blackjackTextArea.append("+-+-+-+ +-+-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |L|O|S|T| |:|(|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        txBalance.setText("" + balance);
                        break;
                        case 1:
                        blackjackTextArea.setText("Congratulations, the dealer bust!");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |W|O|N| |:|)|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+ +-+-+");
                        txBalance.setText("" + balance);

                        break;
                        case 2:
                        blackjackTextArea.setText("Sorry, the dealer beat you.");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |L|O|S|T| |:|(|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        txBalance.setText("" + balance);
                        break;
                        case 3:
                        blackjackTextArea.setText("Congrats, you beat the dealer!");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |W|O|N| |:|)|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+ +-+-+");
                        txBalance.setText("" + balance);
                        break;
                    }
                }
            });
        btnStand.setBounds(303, 193, 118, 23);
        frame.getContentPane().add(btnStand);

        btnHit = new JButton("Hit");
        btnHit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BlackjackHand.playerHand.add(new Card());
                    txUserCards.setText(BlackjackHand.printHand("user"));
                    BlackjackHand.checkAce();
                    lblUserValue.setText("Value: " + BlackjackHand.calcHand("user"));
                    if (BlackjackHand.calcHand("user") > 21) {
                        btnHit.setEnabled(false);
                        btnStand.setEnabled(false);
                        btnSurrender.setEnabled(false);
                        btnDoubleDown.setEnabled(false);
                        blackjackTextArea.setText("Sorry, you bust!");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |L|O|S|T| |:|(|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        balance -= bet;
                        txBalance.setText("" + balance);
                    }
                }
            });
        btnHit.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnHit.setBounds(175, 227, 118, 23);
        frame.getContentPane().add(btnHit);

        btnDoubleDown = new JButton("Double Down");
        btnDoubleDown.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnDoubleDown.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    BlackjackHand.playerHand.add(new Card());
                    txUserCards.setText(BlackjackHand.printHand("user"));
                    BlackjackHand.checkAce();
                    bet += bet;
                    lblUserValue.setText("Value: " + BlackjackHand.calcHand("user"));
                    if (BlackjackHand.calcHand("user") > 21) {
                        btnHit.setEnabled(false);
                        btnStand.setEnabled(false);
                        btnSurrender.setEnabled(false);
                        btnDoubleDown.setEnabled(false);
                        blackjackTextArea.setText("Sorry, you bust!");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        blackjackTextArea.append("\n|Y|O|U| |L|O|S|T| |:|(|");
                        blackjackTextArea.append("\n+-+-+-+ +-+-+-+-+ +-+-+");
                        balance -= bet;
                        txBalance.setText("" + balance);
                    }
                }
            });
        btnDoubleDown.setBounds(175, 193, 118, 23);
        frame.getContentPane().add(btnDoubleDown);

        btnSurrender = new JButton("Surrender");
        btnSurrender.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnSurrender.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnHit.setEnabled(false);
                    btnStand.setEnabled(false);
                    btnSurrender.setEnabled(false);
                    btnDoubleDown.setEnabled(false);
                    for (int i = 0; i < BlackjackHand.playerHand.size(); i++) {
                        BlackjackHand.playerHand.get(i).value = 0;
                    }
                    bet /= 2;
                    blackjackTextArea.setText("You surrenderred.\nYou get half your bet back.");
                    BlackjackHand.checkWinner();
                    txBalance.setText("" + balance);
                }
            });
        btnSurrender.setBounds(303, 227, 118, 23);
        frame.getContentPane().add(btnSurrender);

        JLabel lblYourCardsAre = new JLabel("Your cards are:");
        lblYourCardsAre.setForeground(Color.BLACK);
        lblYourCardsAre.setBounds(10, 30, 153, 14);
        frame.getContentPane().add(lblYourCardsAre);

        JLabel lblTheDealersCards = new JLabel("The Dealer's cards are:");
        lblTheDealersCards.setForeground(Color.BLACK);
        lblTheDealersCards.setBounds(10, 136, 153, 14);
        frame.getContentPane().add(lblTheDealersCards);

        txUserCards = new JTextField();
        txUserCards.setForeground(Color.WHITE);
        txUserCards.setBackground(Color.BLACK);
        txUserCards.setEditable(false);
        txUserCards.setBounds(10, 61, 142, 20);
        frame.getContentPane().add(txUserCards);
        txUserCards.setColumns(10);

        txDealerCards = new JTextField();
        txDealerCards.setForeground(Color.WHITE);
        txDealerCards.setBackground(Color.BLACK);
        txDealerCards.setEditable(false);
        txDealerCards.setBounds(10, 161, 142, 20);
        frame.getContentPane().add(txDealerCards);
        txDealerCards.setColumns(10);

        lblUserValue = new JLabel("Value:");
        lblUserValue.setForeground(Color.BLACK);
        lblUserValue.setBounds(10, 92, 96, 14);
        frame.getContentPane().add(lblUserValue);

        lblDealerValue = new JLabel("Value:");
        lblDealerValue.setForeground(Color.BLACK);
        lblDealerValue.setBounds(10, 193, 96, 14);
        frame.getContentPane().add(lblDealerValue);

        JLabel lblBet = new JLabel("Bet:");
        lblBet.setForeground(Color.BLACK);
        lblBet.setHorizontalAlignment(SwingConstants.RIGHT);
        lblBet.setBounds(375, 136, 46, 14);
        frame.getContentPane().add(lblBet);

        txBet = new JTextField();
        txBet.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    bet = Integer.parseInt(txBet.getText());
                    if (bet > balance) {
                        blackjackTextArea.setText("You bet more than your balance.\nLower your bet.");
                    } else {
                        txUserCards.setText(BlackjackHand.printHand("user"));
                        txDealerCards.setText(BlackjackHand.printHand("dealer"));
                        lblUserValue.setText("Value: " + BlackjackHand.calcHand("user"));
                        lblDealerValue.setText("Value: " + BlackjackHand.dealerHand.get(0).value);
                        BlackjackHand.checkAce();
                        lblUserValue.setText("Value: " + BlackjackHand.calcHand("user"));
                        blackjackTextArea.setText("Choose what you want to do.");
                        btnHit.setEnabled(true);
                        btnStand.setEnabled(true);
                        btnSurrender.setEnabled(true);
                        btnDoubleDown.setEnabled(true);
                    }
                }
            });
        txBet.setBounds(333, 162, 86, 20);
        frame.getContentPane().add(txBet);
        txBet.setColumns(10);
        
        /* This is the button with issues*/
        btnNewHand = new JButton("New Hand");
        btnNewHand.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewHand.setBounds(10, 227, 110, 23);
        frame.getContentPane().add(btnNewHand);
        btnNewHand.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (balance == 0) {
                        blackjackTextArea.setText("You ran out of money :(\nGo back to the main menu to reset it!");
                    } else {
                        bet = 0;
                        txUserCards.setText("");
                        txDealerCards.setText("");
                        lblUserValue.setText("Value: ");
                        lblDealerValue.setText("Value: ");
                        new BlackjackHand();
                        txBet.setEditable(false);
                        btnHit.setEnabled(false);
                        btnStand.setEnabled(false);
                        btnSurrender.setEnabled(false);
                        btnDoubleDown.setEnabled(false);
                        blackjackTextArea.setText("Please enter your bet.");
                        txBet.setEditable(true);
                    }

                }
            });

        JLabel lblBlackjack = new JLabel("Welcome to\r");
        lblBlackjack.setForeground(Color.BLACK);
        lblBlackjack.setFont(new Font("Monotype Corsiva", Font.ITALIC, 50));
        lblBlackjack.setHorizontalAlignment(SwingConstants.CENTER);
        lblBlackjack.setBounds(175, 34, 246, 54);
        frame.getContentPane().add(lblBlackjack);

        blackjackTextArea = new JTextArea();
        blackjackTextArea.setFont(new Font("Courier New", Font.PLAIN, 13));
        blackjackTextArea.setBounds(431, 30, 253, 220);
        blackjackTextArea.setEditable(false);
        frame.getContentPane().add(blackjackTextArea);

        JLabel lblBalance = new JLabel("Balance:");
        lblBalance.setForeground(Color.BLACK);
        lblBalance.setBounds(175, 136, 61, 14);
        frame.getContentPane().add(lblBalance);

        txBalance = new JTextField();
        txBalance.setEditable(false);
        txBalance.setBounds(175, 161, 86, 20);
        frame.getContentPane().add(txBalance);
        txBalance.setColumns(10);

        lblNewLabel = new JLabel("Blackjack");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 50));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(175, 73, 246, 62);
        frame.getContentPane().add(lblNewLabel);
    }

}
