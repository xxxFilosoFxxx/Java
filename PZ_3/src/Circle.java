import java.util.*;

public class Circle {
    private Point p;
    private int radius;
    private List<Circle> list_Circle = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Circle()
    {
        p = new Point();
        this.radius = 0;
    }

    Circle(double x, double y, int r)
    {
        p = new Point(x, y);
        this.radius = r;
    }

    public Point getPoint()
    {
        return this.p;
    }

    public double get_x()
    {
        return this.p.getX();
    }
    public double get_y()
    {
        return this.p.getY();
    }

    public int getRad()
    {
        return this.radius;
    }

    @Override
    public String toString() {
        return this.p + "\tradius:\t" + this.radius;
    }

    public void add_circle(){
        System.out.println("Введите количество элементов: ");
        int size = in.nextInt();
        System.out.println("Введите координаты x, y, radius:");
        for (int i = 0; i < size; i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            radius = in.nextInt();
            Circle c = new Circle(x, y, radius);
            list_Circle.add(c);

        }
        System.out.println("Значения добавлены в список!");
    }


    public void get_circle() {
        System.out.println("Вывод значений: ");
        for (Circle c:list_Circle)
        {
            System.out.println(c);
        }

    }

    public void remove(){
        System.out.println("Введите значения, которые хотите удалить: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        radius = in.nextInt();
        p = new Point(x, y);
        list_Circle.removeIf((Circle a) -> {
            return a.getPoint() == p && a.getRad() == radius;
        });

        System.out.println("Элементы после удаления: ");
        get_circle();
    }

    public void get_circle_max() {
        System.out.println("Список точек в порадяке возрастания по X: ");
        list_Circle.sort(new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return  o1.getRad() -  o2.getRad();
            }
        });

    }

    public void get_circle_min() {
        System.out.println("Список точек в порадяке убывания по X: ");
        get_circle_max();
        Collections.reverse(list_Circle);
    }

    public void check(){
        for (Circle c:list_Circle)
        {
           if (Math.pow(c.get_x() - p.getX(), 2) + Math.pow(c.get_y() - p.getY(), 2) < Math.pow(c.getRad(), 2))
           {
               p.get_point();
           }
           else
           {
               System.out.println("Точек в окружности нет!");
           }
        }
    }


}
