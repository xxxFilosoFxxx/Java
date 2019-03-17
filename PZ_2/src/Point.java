public class Point implements IDrawable {
    double x, y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(double a, double b)
    {
        this.x = a;
        this.y = b;
    }

    public String toString()
    {
        return "Координата x: " + this.x + ", координата y: " + this.y;

    }


    public boolean equals(Point p) {
        if(p.x == x && p.y == y)
            return true;
        return false;

    }

    @Override
    public void draw() {
        System.out.println("Класс точки и его координты x, y:" + this.x + ", " + this.y);
    }
}

