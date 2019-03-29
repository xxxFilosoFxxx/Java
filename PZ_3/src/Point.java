import java.util.*;

public class Point {
    private double x, y;
    private List<Point> list_Point = new ArrayList<>();
    Scanner in = new Scanner(System.in);
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

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }


    @Override
    public String toString() {
        return "x:\t" + this.x + "\ty:\t" + this.y + " ";
    }

    public void add_point() {
        System.out.println("Введите количество элементов: ");
        int size = in.nextInt();
        System.out.println("Введите координаты x, y:");
        for (int i = 0; i < size; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            Point p = new Point(x, y);
            list_Point.add(p);

        }
        System.out.println("Значения добавлены в список!");
    }

    public void get_point(){

        System.out.println("Вывод значений: ");
        for (Point p:list_Point)
        {
            System.out.println(p);
        }
    }

    public void remove(){
        System.out.println("Введите значения, которые хотите удалить: ");
        x = in.nextDouble();
        y = in.nextDouble();
        list_Point.removeIf((Point a) -> {
            return a.getX() == x && a.getY() == y;
        });

        System.out.println("Элементы после удаления: ");
        get_point();
    }


    public void get_point_max() {
        System.out.println("Список точек в порадяке возрастания по X: ");
        list_Point.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (int) o1.getX() - (int) o2.getX();
            }
        });

    }

    public void get_point_min() {
        System.out.println("Список точек в порадяке убывания по X: ");
        get_point_max();
        Collections.reverse(list_Point);
    }
}

