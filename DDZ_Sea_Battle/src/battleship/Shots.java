package battleship;
import java.awt.*;
import java.util.ArrayList;

public class Shots {
    private final int CELL_SIZE;
    private ArrayList<Shot> shots = new ArrayList<>();

    Shots(int cellSize)
    {
        CELL_SIZE = cellSize;
    }

    void add(int x, int y, boolean shot)
    {
        Shot s = new Shot(x,y,shot);
        shots.add(s);
    }

    //TODO

}
