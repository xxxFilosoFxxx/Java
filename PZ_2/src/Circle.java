public class Circle implements IDrawable {
    double radius;
    private Point point;

    public Circle() {
        point = new Point(0, 0);
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        point = new Point(x, y);
        radius = r;
    }

    public String toString()
    {
        return this.point + ", радиус: " + this.radius;
    }

    public boolean equals(Circle c) {
        if(c.point == point && c.radius == radius)
            return true;
        return false;

    }

    public double square()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Класс окружности и его свойства: " + this.point + ", радиус: " + this.radius);
    }
}
