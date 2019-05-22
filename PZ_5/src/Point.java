import java.util.*;

public class Point {
    private double x, y;
    private List<Point> listPoints;
    private int interval;
    Scanner in;
    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    Point(double a, double b)
    {
        this.x = a;
        this.y = b;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }


    public void generateListPoints()
    {
        listPoints = new ArrayList<>();
    }

    public List<Point> getListPoints()
    {
        return listPoints;
    }

    public void setInterval()
    {
        try
        {
            in = new Scanner(System.in);
            System.out.print("Введите диапазон значений:\nМинимальная длина списка- ");
            int min = in.nextInt();
            System.out.print("Максимальная  длина списка- ");
            int max = in.nextInt();
            interval = (int) (min + Math.random() * (max - min + 1));
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Ошибка ввода данных!");
        }
    }

    public void add_points()
    {
        for (int i = 0; i < interval; i++) {
            x = Math.random()*20 - 10;
            y = Math.random()*20 - 10;
            Point p = new Point(x, y);
            listPoints.add(p);
        }
        System.out.println("Значения добавлены в список!");
    }

    public int getInterval()
    {
        return interval;
    }

    @Override
    public String toString() {
        return "x:\t" + this.x + "\ty:\t" + this.y + " ";
    }

    public void printPoints()
    {
        System.out.println("Вывод значений: ");
        for (Point p:listPoints)
        {
            System.out.println(p);
        }
    }

}
