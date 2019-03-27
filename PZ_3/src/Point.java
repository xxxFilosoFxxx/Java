import java.util.*;

public class Point {
    public double x, y;
    public static int size;
    Scanner in = new Scanner(System.in);

    public static ArrayList<Double> List_X_Point = new ArrayList<>();
    public static ArrayList<Double> List_Y_Point = new ArrayList<>();
    public static ArrayList<Double> List_Point = new ArrayList<>();

    public void add_point() {
        System.out.println("Введите количество элементов: ");
        size = in.nextInt();
        System.out.println("Введите координаты x, y:");
        for (int i = 0; i < size; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            List_X_Point.add(x);
            List_Y_Point.add(y);
            List_Point.add(x);
            List_Point.add(y);
        }
        System.out.println("Значения добавлены в список!");
    }

    public void get_point(){

        System.out.println("Вывод значений: ");
        int j = 0;
        for (int i=0; i < List_Point.size(); i += 2)
        {
            if((i+1)<List_Point.size()) {

                System.out.println(j + ")  x: " + List_Point.get(i) + "  y: " + List_Point.get(i + 1));
                j++;
            }
        }

    }

    public void remove(){
        System.out.println("Введите индекс элемента, который хотите удалить: ");
        int value = in.nextInt();
        if (value < size) {
            List_X_Point.remove(value);
            List_Y_Point.remove(value);
        }
        else{
            System.out.println("Элемента с таким индексом нет!");
        }

        System.out.println("Элементы после удаления: ");

        for (int i=0; i < List_X_Point.size(); i++)
        {
            System.out.println(i + ")  x: " + List_X_Point.get(i) + "  y: " + List_Y_Point.get(i) );
        }
    }

    public void get_point_max() {
        for (int i = List_Point.size() - 1 ; i > 0; i-=2) {
            for (int j = 0; j < i; j+=2) {
                if(j+2 < List_Point.size()) {
                    if (List_Point.get(j) > List_Point.get(j + 2)) {
                        smena(j);
                    }
                }
            }
        }

        get_point();
    }
    public void get_point_min() {
        for (int i = List_Point.size() - 1 ; i > 0; i-=2) {
            for (int j = 0; j < i; j+=2) {
                if(j+2 < List_Point.size()) {
                    if (List_Point.get(j) < List_Point.get(j + 2)) {
                        smena(j);
                    }
                }
            }
        }

       get_point();
    }

    public void smena(int j) {
        double tmp = List_Point.get(j);
        double tpp = List_Point.get(j + 2);
        List_Point.set(j, tpp);
        List_Point.set(j + 2, tmp);
        double tmpp = List_Point.get(j+1);
        double tppp = List_Point.get(j +3);
        List_Point.set(j+1, tppp);
        List_Point.set(j + 3, tmpp);
    }


}

