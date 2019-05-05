package battleship;

import java.awt.*;

public class Cell {
    private int x, y;
    public Color color;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.gray;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    boolean checkHit(int x, int y) {
        if (this.x == x && this.y == y) {
            color = Color.red; //TODO red or yellow
            return true;
        }
        return false;
    }

    boolean live() // понадобиться далее
    {
        return color != Color.red;
    }

    /*boolean checkKill() // понадобиться далее
    {
        return this.color == Color.red;
    }*/

    void paint(Graphics g, int cellSize)  // скрывает корабли для человека
    {
        if (color == Color.red) {
            g.setColor(color);
            g.fill3DRect(x * cellSize + 1, y * cellSize + 1, cellSize - 2, cellSize - 2, true);
        }
    }
}
