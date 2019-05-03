package battleship;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ships {
    private final int CELL_SIZE;
    private ArrayList<Ship> ships;
    private final int[] DECKS = {4,3,3,2,2,2,1,1,1,1};
    private Random random;

    public Ships(int fieldSize, int cellSize)
    {
        ships = new ArrayList<>();
        random = new Random();
        for (int i = 0; i < DECKS.length; i++)
        {
            Ship ship;
            do
            {
                int x = random.nextInt(fieldSize);
                int y = random.nextInt(fieldSize);
                int location = random.nextInt(2);
                ship = new Ship(x, y, DECKS[i], location);

            }while (ship.outOfField(0, fieldSize - 1)  || contact(ship));
            ships.add(ship);
        }
        CELL_SIZE = cellSize;
    }

    boolean contact(Ship sh)
    {
        for (Ship ship : ships)
        {
            if (ship.contact(sh))
                return true;
        }
        return false;
    }

    public boolean checkHit(int x, int y)
    {
        for (Ship ship : ships)
        {
            if (ship.checkHit(x, y))
                return true;
        }
        return false;
    }

    public boolean checkLive()
    {
        for (Ship ship : ships)
        {
            if (ship.live())
                return true;
        }
        return false;
    }

    public void paint(Graphics g)
    {
        for (Ship ship : ships)
        {
            ship.paint(g,CELL_SIZE);
        }
    }

}
