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

   /* public boolean equals(Object obj)
    {
        return (this == obj);
    }*/

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public void draw() {
        System.out.println("Класс точки и его координты x, y:" + this.x + ", " + this.y);
    }
}

