import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static int menuPrint() {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("                    ~~~~~~~~~МЕНЮ~~~~~~~~~");
        System.out.println("1.                      Добавить точку");
        System.out.println("2.                   Добавить окружность");
        System.out.println("3.              Удаление из списка заданных точек");
        System.out.println("4.          Удаление из списка заданных окружностей");
        System.out.println("5.         Вывод списка точек в порядке заполнения;");
        System.out.println("6.       Вывод списка окружностей в порядке заполнения");
        System.out.println("7.         Вывод списка точек в порядке возрастания x");
        System.out.println("8.    Вывод списка окружностей в порядке возрастания центра");
        System.out.println("9.         Вывод списка точек в порядке уменьшения x");
        System.out.println("10.   Вывод списка окружностей в порядке уменьшения центра");
        System.out.println("11.      Вывод на экран точек, находящихся в окружности");
        System.out.println("0.     ~~~~~~~~ПЕРЕХОД К ФОРМАТУ ЗАПИСИ В ФАЙЛ~~~~~~~~");
        System.out.println("                       Выберете пункт!");
        choice = input.nextInt();
        return choice;
    }

    public void menuChoice() throws IOException {

        Point p = new Point();
        Circle c = new Circle();
        p.write_point();
        c.write_circle();
        int choice;
        do
        {
            choice = menuPrint();
            switch (choice)
            {
                case 1:
                    p.add_point();
                    break;
                case 2:
                    c.add_circle();
                    break;
                case 3:
                    p.remove();
                    break;
                case 4:
                    c.remove();
                    break;
                case 5:
                    p.get_point();
                    break;
                case 6:
                    c.get_circle();
                    break;
                case 7:
                    p.get_point_max();
                    p.get_point();
                    break;
                case 8:
                    c.get_circle_max();
                    c.get_circle();
                    break;
                case 9:
                    p.get_point_min();
                    p.get_point();
                    break;
                case 10:
                    c.get_circle_min();
                    c.get_circle();
                    break;
                case 11:
                    c.check();
                    break;
                default:
                    break;
            }
        }while(choice != 0);

        File f1 = new File("../Java/PZ_4/src/Point.txt");
        File f2 = new File("../Java/PZ_4/src/Circle.txt");
        if (f1.exists() && f2.exists())
        {
        Scanner input = new Scanner(System.in);
        int count1;
        System.out.println("         ~~~~~~~~~Выберите вариант сортировки для записи в файл~~~~~~~~~");
        System.out.println("1.                     В порядке добавления данных в списке");
        System.out.println("2.            В порядке возрастания значения X или центра окружности");
        System.out.println("3.             В порядке уменьшения значения X или центра окружности");

        count1 = input.nextInt();

        switch (count1) {
            case 1:
                break;
            case 2:
                p.get_point_max();
                c.get_circle_max();
                break;
            case 3:
                p.get_point_min();
                c.get_circle_min();
                break;
            default:
                break;
        }

            int count2;
            System.out.println("        ~~~~~~~~~Выберите способ записи в файл~~~~~~~~~");
            System.out.println("1.                  Добавить в конец файла");
            System.out.println("2.                Заменить содержимое файла");
            System.out.println("3.                  Отказ от записи в файл");

            count2 = input.nextInt();

            switch (count2) {
                case 1:
                    p.save_point_add();
                    c.save_circle_add();
                    break;
                case 2:
                    p.save_point_change();
                    c.save_circle_change();
                case 3:
                    break;
                default:
                    p.save_point_add();
                    c.save_circle_add();
                    break;
            }
        }
        else
        {
            System.out.println("Не удалось найти файлы в системе  :(");
        }


    }

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.menuChoice();
    }

}

