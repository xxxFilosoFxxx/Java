package battleship;
import java.awt.*;
import java.util.ArrayList;

public class Shots {
    private final int CELL_SIZE;
    private ArrayList<Shot> shots;

    public Shots(int cellSize)
    {
        shots = new ArrayList<>();
        CELL_SIZE = cellSize;
    }

    public void add(int x, int y, boolean shot)
    {
        Shot s = new Shot(x,y,shot);
        shots.add(s);
    }

    public boolean hitAgain(int x, int y)
    {
        for (Shot shot : shots)
        {
            if (shot.getX() == x && shot.getY() == y && shot.checkShot())
                return true;
        }
        return false;
    }

    public Shot getLabel(int x, int y)
    {
        for (Shot label : shots)
        {
            if (label.getX() == x && label.getY() == y && (!label.checkShot()))
                return label;
        }
        return null;
    }

    public void removeLabel(Shot label)
    {
        shots.remove(label);
    }

    public void paint(Graphics g)
    {
        for (Shot shot : shots)
        {
            shot.paint(g,CELL_SIZE);
        }
    }
}
