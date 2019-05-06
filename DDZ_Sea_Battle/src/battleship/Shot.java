package battleship;

import java.awt.*;

public class Shot {
    private int x, y;
    private boolean shot;

    Shot(int x, int y, boolean shot) {
        this.x = x;
        this.y = y;
        this.shot = shot;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    boolean checkShot() {
        return shot;
    }

    void paint(Graphics g, int cellSize) {
        g.setColor(Color.black);
        if (shot) {
            g.fillOval(x * cellSize + cellSize / 2 - 3, y * cellSize + cellSize / 2 - 3, 8, 8);
        } else {
            g.drawOval(x * cellSize + cellSize / 2 - 3, y * cellSize + cellSize / 2 - 3, 8, 8);
        }
    }

}
