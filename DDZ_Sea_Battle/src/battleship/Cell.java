package battleship;
import java.awt.*;

public class Cell {
    private int x, y;
    private Color color;

    Cell(int x, int y)
    {
        this.x = x;
        this.y = y;
        color = Color.gray;
    }

    int getX() { return this.x; }
    int getY() { return this.y; }

    boolean checkHit(int x, int y)
    {
        if (this.x == x && this.y == y )
        {
            color = Color.yellow; //TODO red or yellow
            return true;
        }
        return false;
    }

    boolean live() // понадобиться далее
    {
        return color != Color.yellow || color != Color.red;
    }

    boolean checkKill() // понадобиться далее
    {
        if (this.color == Color.yellow)
        {
            color = Color.red;
            return true;
        }
        return false;
    }

    void paint(Graphics g, int cellSize, boolean hide)  // скрывает корабли для человека
    {
        if (!hide || color == Color.red || color == Color.yellow)
        {
            g.setColor(color);
            g.fill3DRect(x*cellSize + 1, y*cellSize + 1, cellSize - 2, cellSize -2, true);
        }
    }
}
