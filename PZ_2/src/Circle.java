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

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (point != other.point)
            return false;
        if (radius != other.radius)
            return false;
        return true;
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
