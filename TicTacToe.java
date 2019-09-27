/**************************************************
 * Title: TIC TAC TOE GUI
 * Author: Abhishek Humagain
 * Date: 24th April 2017
 *************************************************/

package tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Random rand;

    private int whoseTurn = -1;
    private int computer = 0;
    private int user = 1;
    private String compMoves = "";
    private String userMoves = "";

    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Tic Tac Toe");
        setSize(700, 700);
        rand = new Random();
        setLocationRelativeTo(this);

        setLayout(new GridLayout(3, 3));
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        b1.setFont(new Font("consolas", Font.BOLD, 60));
        b2.setFont(new Font("consolas", Font.BOLD, 60));
        b3.setFont(new Font("consolas", Font.BOLD, 60));
        b4.setFont(new Font("consolas", Font.BOLD, 60));
        b5.setFont(new Font("consolas", Font.BOLD, 60));
        b6.setFont(new Font("consolas", Font.BOLD, 60));
        b7.setFont(new Font("consolas", Font.BOLD, 60));
        b8.setFont(new Font("consolas", Font.BOLD, 60));
        b9.setFont(new Font("consolas", Font.BOLD, 60));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        makeComputerMove();
    }

    public static void main(String[] args) {

        TicTacToe gui = new TicTacToe();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("CLICK!!");

        JButton source = (JButton) e.getSource();

        source.setText("O");
        source.setEnabled(false);
        whoseTurn = computer;
        makeComputerMove();
        Winner();
    }

    private void makeComputerMove() {
        int selectedButton = rand.nextInt(9);
        switch (selectedButton) {
            case 0:
                if (b1.isEnabled()) {
                    b1.setText("X");
                    b1.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b1";
                break;
            case 1:
                if (b2.isEnabled()) {
                    b2.setText("X");
                    b2.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b2";
                break;
            case 2:
                if (b3.isEnabled()) {
                    b3.setText("X");
                    b3.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b3";
                break;
            case 3:
                if (b4.isEnabled()) {
                    b4.setText("X");
                    b4.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b4";
                break;
            case 4:
                if (b5.isEnabled()) {
                    b5.setText("X");
                    b5.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b5";
                break;
            case 5:
                if (b6.isEnabled()) {
                    b6.setText("X");
                    b6.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b6";
                break;
            case 6:
                if (b7.isEnabled()) {
                    b7.setText("X");
                    b7.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b7";
                break;
            case 7:
                if (b8.isEnabled()) {
                    b8.setText("X");
                    b8.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b8";
                break;
            case 8:
                if (b9.isEnabled()) {
                    b9.setText("X");
                    b9.setEnabled(false);
                } else {
                    makeComputerMove();
                }
                compMoves = "b9";
                break;

        }
        whoseTurn = user;
    }

    private void Winner() {
        if (b1.getText() == "X"
                && b2.getText() == "X"
                && b3.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        } else if (b1.getText() == "X"
                && b4.getText() == "X"
                && b7.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b2.getText() == "X"
                && b5.getText() == "X"
                && b8.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b3.getText() == "X"
                && b6.getText() == "X"
                && b9.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b4.getText() == "X"
                && b5.getText() == "X"
                && b6.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b7.getText() == "X"
                && b8.getText() == "X"
                && b9.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b1.getText() == "X"
                && b5.getText() == "X"
                && b9.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b3.getText() == "X"
                && b5.getText() == "X"
                && b7.getText() == "X") {
            JOptionPane.showMessageDialog(this, "COMPUTER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b1.getText() == "O"
                && b2.getText() == "O"
                && b3.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b1.getText() == "O"
                && b4.getText() == "O"
                && b7.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b2.getText() == "O"
                && b5.getText() == "O"
                && b8.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b3.getText() == "O"
                && b6.getText() == "O"
                && b9.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b4.getText() == "O"
                && b5.getText() == "O"
                && b6.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b7.getText() == "O"
                && b8.getText() == "O"
                && b9.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b1.getText() == "O"
                && b5.getText() == "O"
                && b9.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (b3.getText() == "O"
                && b5.getText() == "O"
                && b7.getText() == "O") {
            JOptionPane.showMessageDialog(this, "USER WON", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            if (!b1.isEnabled()
                    && !b2.isEnabled()
                    && !b3.isEnabled()
                    && !b4.isEnabled()
                    && !b5.isEnabled()
                    && !b6.isEnabled()
                    && !b7.isEnabled()
                    && !b8.isEnabled()
                    && !b9.isEnabled()) {
                JOptionPane.showMessageDialog(this, "NO WINNER", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

        }

    }

}
