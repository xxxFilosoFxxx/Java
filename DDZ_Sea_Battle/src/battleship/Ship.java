package battleship;
import java.util.ArrayList;
import java.awt.*;

public class Ship {
    private ArrayList<Cell> ship;
    Ship(int x, int y, int lenght, int location)  // location - положение корабля(направление)
    {
        ship = new ArrayList<>();
        for (int i = 0; i < lenght; i++)
        {
            ship.add( new Cell(x + i*((location == 1)? 0 : 1), y + i*((location == 1)? 1 : 0)));
        }
    }

    boolean outOfField(int bottom, int top) // них и верх
    {
        for(Cell cell : ship)
        {
            if ((cell.getX() < bottom || cell.getX() > top) || (cell.getY() < bottom || cell.getY() > top))
            {
                return true;
            }
        }
        return false;
    }

    boolean contact(Ship sh)
    {
        for(Cell cell : ship)
        {
            if (sh.contactCell(cell))
                return true;
        }
        return false;
    }

    boolean contactCell(Cell ce)
    {
        for(Cell cell : ship)
        {
            for (int i = -1; i < 2; i ++)
                for (int j = -1; j < 2; j++)
                    if ((ce.getX() == cell.getX() + i) && (ce.getY() == cell.getY() + j))
                        return true;
        }
        return false;
    }

    boolean checkHit(int x, int y)
    {
        for (Cell cell : ship) {
            if (cell.checkHit(x, y))
                return true;
        }
        return false;
    }

    boolean live()
    {
        for (Cell cell : ship) {
            if (cell.live())
                return true;
        }
        return false;
    }

    void paint (Graphics g, int cellSize)
    {
        for (Cell cell : ship)
        {
            cell.paint(g,cellSize);
        }
    }
}
