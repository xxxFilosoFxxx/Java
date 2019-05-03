package GUI_swing;
import battleship.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.MouseInputAdapter;

import java.util.*;


public class Battle extends JFrame {
    final int WINDOW_SIZE = 500;
    final int CELL_SIZE = WINDOW_SIZE/10;

    JTextArea board;
    Canvas field; //поле
    Ships ships; // корабли
    Shots shots; // выстрелы
    Random random;
    boolean gameOver; // проверка, что кораблей больше не осталось


    public static void main(String[] args)
    {
        new Battle();
    }

    Battle()
    {
        setTitle("Game BattleShip");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        field = new Canvas();
        field.setPreferredSize(new Dimension(WINDOW_SIZE,WINDOW_SIZE));
        field.setBackground(Color.white);

        Border lineBorder = BorderFactory.createLineBorder(Color.blue);
        field.setBorder(lineBorder);

        field.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                int x = e.getX()/CELL_SIZE;
                int y = e.getY()/CELL_SIZE;

                if (e.getButton() == MouseEvent.BUTTON1 && !gameOver)
                {
                    if(!shots.hitAgain(x,y))
                    {
                        shots.add(x,y,true);
                        if (ships.checkHit(x,y))
                        {
                            board.append("\nYou Hit");
                            if (!ships.checkLive()) {
                                board.append("\nYou Won");
                                gameOver = true;
                            }
                        }

                        field.repaint();
                        board.setCaretPosition(board.getText().length());
                    }
                }
                if (e.getButton() == MouseEvent.BUTTON3)
                {
                    Shot lable = shots.getLabel(x,y);
                    if (lable != null)
                        shots.removeLabel(lable);
                    else
                        shots.add(x, y, false);
                    field.repaint();
                }
            }
        });

        JButton start = new JButton("New Game");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
                field.repaint();
            }
        });

        JButton exit = new JButton("Give up");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        board = new JTextArea();
        board.setEditable(false);
        JScrollPane scroll = new JScrollPane(board);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.add(start);
        panel.add(exit);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(scroll, BorderLayout.CENTER);
        rightPanel.add(panel, BorderLayout.SOUTH);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        add(field);
        add(rightPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        start();
    }

    void start()
    {
        random = new Random();
        ships = new Ships(10, CELL_SIZE);
        shots = new Shots(CELL_SIZE);
        board.setText("New Game");
        gameOver = false;
    }

    class Canvas extends JPanel
    {
        @Override
        public void paint(Graphics g)
        {
            super.paint(g);
            int cellSize = (int)getSize().getWidth() / 10;
            g.setColor(Color.darkGray);
            for (int i = 1; i < 10; i++)
            {
                g.drawLine(0, i*cellSize, 10 * cellSize, i*cellSize );
                g.drawLine(i*cellSize, 0, i*cellSize, 10*cellSize);
            }
            if (cellSize == CELL_SIZE)
            {
                shots.paint(g);
                ships.paint(g);
            }
        }
    }

}
