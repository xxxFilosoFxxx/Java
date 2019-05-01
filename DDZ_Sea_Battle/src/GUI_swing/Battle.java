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

 //   JTextArea board;
    Canvas field; //поле
    Ships ships; // корабли
    Shots shots; // выстрелы
    Random random;
    boolean gameOver; // проверка, что кораблей больше не осталось

    public static void main(String[] args)
    {
        // TODO
    }

    Battle()
    {
        setTitle("Game BattleShip");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        //setVisible(true);

        field = new Canvas();
        field.setPreferredSize(new Dimension(WINDOW_SIZE,WINDOW_SIZE));
        field.setBackground(Color.white);

      //  Border lineBorder = BorderFactory.createLineBorder(Color.blue);
      //  field.setBorder(lineBorder);
        field.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                int x = e.getX()/CELL_SIZE;
                int y = e.getY()/CELL_SIZE;

                if (e.getButton() == MouseEvent.BUTTON1 && gameOver)
                {

                }
                // TODO
            }
        });


    }

}
