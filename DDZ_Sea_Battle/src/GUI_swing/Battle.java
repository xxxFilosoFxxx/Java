package GUI_swing;
import battleship.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class Battle extends JFrame {
    final int WINDOW_SIZE = 500;
    final int CELL_SIZE = WINDOW_SIZE/10;

    //JTextArea
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
        setResizable(true);
        //setVisible(true);

        field = new Canvas();
        field.setPreferredSize(new Dimension(WINDOW_SIZE,WINDOW_SIZE));
        field.setBackground(Color.white);

        // TODO
    }

}
