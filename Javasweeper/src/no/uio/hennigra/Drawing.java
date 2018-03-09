package no.uio.hennigra;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JFrame {
    public static void main(String[] args) {
        Drawing drawing = new Drawing(new Board());
    }

    public Drawing(Board board) {
        setLayout(new BorderLayout());
        add(new MinesweeperPanel(board), BorderLayout.CENTER);
        pack();
        repaint();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class MinesweeperPanel extends JPanel implements MouseListener {
        public MinesweeperPanel(Board board) {
            addMouseListener(this);

            setPreferredSize(new Dimension(400, 300));
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;

            for (int i = 0; i < 9; i++) {
                g2d.drawLine(i * 35, 0, i * 35, 6 * 35);
            }

            for (int i = 0; i < 7; i++) {
                g2d.drawLine(0, i * 35, 8 * 35, i * 35);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}