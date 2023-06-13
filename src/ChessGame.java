import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGame extends JFrame {
    private final int BOARD_SIZE = 8;
    private JButton[][] squares;

    public ChessGame() {
        super("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        squares = new JButton[BOARD_SIZE][BOARD_SIZE];

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                squares[row][col] = new JButton();
                squares[row][col].addActionListener(new SquareActionListener(row, col));
                add(squares[row][col]);
            }
        }

        setSize(600, 600);
        setVisible(true);
    }

    private class SquareActionListener implements ActionListener {
        private int row;
        private int col;

        public SquareActionListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Implement your logic here for handling square clicks
            System.out.println("Clicked square: " + row + ", " + col);
        }
    }

}
