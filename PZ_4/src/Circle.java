import java.util.*;
import java.io.*;

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
        System.out.println("Список окружностей в порядке возрастания центра ");
        list_Circle.sort(Comparator.comparing(Circle::getRad));
    }

    public void get_circle_min() {
        System.out.println("Список окружностей в порядке уменьшения центра ");
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

    public void save_circle_change() throws IOException {
        FileWriter file = new FileWriter("../Java/PZ_4/src/Circle.txt");

        for (Circle c: list_Circle)
        {
            file.write(c.get_x() + " " + c.get_y() + " " + c.getRad() + "\n");
        }

        file.close();
    }

    public void save_circle_add() throws IOException {
        FileWriter file = new FileWriter("../Java/PZ_4/src/Circle.txt", true);

        for (Circle c: list_Circle)
        {
            file.write(c.get_x() + " " + c.get_y() + " " + c.getRad() + "\n");
        }

        file.close();
    }

    public void write_circle() throws IOException
    {
        FileReader file= new FileReader("../Java/PZ_4/src/Circle.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] str = new String(scan.nextLine()).split(" ");
            double val_x = Double.parseDouble(str[0]);
            double val_y = Double.parseDouble(str[1]);
            int val_rad = Integer.parseInt(str[2]);
            Circle val_c = new Circle(val_x,val_y,val_rad);
            list_Circle.add(val_c);
        }

        file.close();
    }
}
