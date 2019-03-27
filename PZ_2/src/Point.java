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

    @Override
    public String toString()
    {
        return "Координата x: " + this.x + ", координата y: " + this.y;
      //  return String.format("Координата x: " + this.x + ", координата y: " + this.y);

    }

    @Override
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
        System.out.println("Координата x: " + this.x + ", координата y: " + this.y);
    }
}

