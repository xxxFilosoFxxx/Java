import java.util.*;
import java.io.*;

public class Point {

    private double x, y;
    private static List<Point> list_Point = new ArrayList<>();
    Scanner in = new Scanner(System.in);
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
        System.out.println("Список точек в порадяке возрастания по X ");
        list_Point.sort(Comparator.comparing(Point::getX));
    }

    public void get_point_min() {
        System.out.println("Список точек в порадяке убывания по X ");
        get_point_max();
        Collections.reverse(list_Point);
    }

    public void save_point_change() throws IOException {
        FileWriter file = new FileWriter("../Java/PZ_4/src/Point.txt");

        for (Point p: list_Point)
        {
            file.write(p.getX() + " " + p.getY() + "\n");
        }
        file.close();
    }

    public void save_point_add() throws IOException {
        FileWriter file = new FileWriter("../Java/PZ_4/src/Point.txt", true);

        for (Point p: list_Point)
        {
            file.write(p.getX() + " " + p.getY() + "\n");
        }
        file.close();
    }

    public void write_point() throws IOException
    {
        FileReader file= new FileReader("../Java/PZ_4/src/Point.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] str = new String(scan.nextLine()).split(" ");
            double val_x = Double.parseDouble(str[0]);
            double val_y = Double.parseDouble(str[1]);
            Point val_p = new Point(val_x,val_y);
            list_Point.add(val_p);
        }

        file.close();
    }
}

