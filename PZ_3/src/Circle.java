import java.util.*;

public class Circle {
    public double x, y, r;
    public static int size;
    Scanner in = new Scanner(System.in);

    public static ArrayList<Double> List_X_Circle = new ArrayList<>();
    public static ArrayList<Double> List_Y_Circle = new ArrayList<>();
    public static ArrayList<Double> List_R_Circle = new ArrayList<>();
    public static ArrayList<Double> List_Circle = new ArrayList<>();
    Point p = new Point();

    public void add_circle(){
        System.out.println("Количество элементов: ");
        size = in.nextInt();
        System.out.println("Введите координаты x, y, r:");
        for (int i = 0; i < size; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            r = in.nextDouble();
            List_X_Circle.add(x);
            List_Y_Circle.add(y);
            List_R_Circle.add(r);
            List_Circle.add(x);
            List_Circle.add(y);
            List_Circle.add(r);
        }
    }


    public void get_circle() {
        int j = 0;
        System.out.println("Вывод значений: ");
        for (int i=0; i < List_Circle.size(); i+=3)
        {
            if((i+2)<List_Circle.size()) {
                System.out.println(j + ")  x: " + List_Circle.get(i) + "  y: " + List_Circle.get(i + 1) + "  r:  " + List_Circle.get(i + 2));
                j++;
            }
        }

    }

    public void remove(){
        System.out.println("Введите индекс элемента, который хотите удалить: ");
        int value = in.nextInt();
        if (value < size) {
            List_X_Circle.remove(value);
            List_Y_Circle.remove(value);
            List_R_Circle.remove(value);
        }
        else{
            System.out.println("Элемента с таким индексом нет!");
        }

        System.out.println("Элементы после удаления");
        for (int i=0; i < List_X_Circle.size(); i++)
        {
            System.out.println(i + ")  x: " + List_X_Circle.get(i) + "  y: " + List_Y_Circle.get(i) + "  r:  " + List_R_Circle.get(i));

        }

    }

    public void get_circle_max() {
        for (int i = List_Circle.size() - 1 ; i > 0; i-=3) {
            for (int j = 0; j < i; j+=3) {
                if(j+5 < List_Circle.size()) {
                    if (List_Circle.get(j) > List_Circle.get(j + 3) && List_Circle.get(j+1) > List_Circle.get(j + 4)) {
                        smena_circle(j);
                    }
                }
            }
        }

        get_circle();
    }

    public void get_circle_min() {
        for (int i = List_Circle.size() - 1 ; i > 0; i-=3) {
            for (int j = 0; j < i; j+=3) {
                if(j+5 < List_Circle.size()) {
                    if (List_Circle.get(j) < List_Circle.get(j + 3) && List_Circle.get(j+1) < List_Circle.get(j + 4)) {
                        smena_circle(j);
                    }
                }
            }
        }
       get_circle();
    }

    public void smena_circle(int j) {
        double tmp = List_Circle.get(j);
        double tpp = List_Circle.get(j + 3);
        List_Circle.set(j, tpp);
        List_Circle.set(j + 3, tmp);
        double tmpp = List_Circle.get(j+1);
        double tppp = List_Circle.get(j +4);
        List_Circle.set(j+1, tppp);
        List_Circle.set(j + 4, tmpp);
        double tmppp = List_Circle.get(j+2);
        double tpppp = List_Circle.get(j +5);
        List_Circle.set(j+2, tpppp);
        List_Circle.set(j + 5, tmppp);
    }

    public void check()
    {
        for (int i=0; i < List_X_Circle.size(); i++){
            if(Math.pow((List_X_Circle.get(i) - p.List_X_Point.get(i)),2) + Math.pow((List_Y_Circle.get(i) - p.List_Y_Point.get(i)),2) < Math.pow(List_R_Circle.get(i),2)){
                System.out.println(i + ")  x: " + p.List_X_Point.get(i)+ "  y: " + p.List_Y_Point.get(i));
            }
            else{
                System.out.println("Точек в окружности нет!");
            }
        }
    }

}
