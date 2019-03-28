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
        System.out.println("0.                  ~~~~~~~~ВЫХОД~~~~~~~~");
        System.out.println("                       Выберете пункт!");
        choice = input.nextInt();
        return choice;
    }

    public void menuChoice() throws IOException {

        Point p = new Point();
        Circle c = new Circle();
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
               //     c.add_circle();
                    break;
                case 3:
                    p.remove();
                    break;
                case 4:
               //     c.remove();
                    break;
                case 5:
                    p.get_point();
                    break;
                case 6:
               //     c.get_circle();
                    break;
                case 7:
                    p.get_point_max();
                    p.get_point();
                    break;
                case 8:
                //    c.get_circle_max();
                    break;
                case 9:
                    p.get_point_min();
                    p.get_point();
                    break;
                case 10:
               //     c.get_circle_min();
                    break;
                case 11:
               //     c.check();
                    break;
                default: throw new IOException();
            }
        }while(choice != 0);
    }

    public static void main(String[] args) throws IOException {

        try {
            Menu menu = new Menu();
            menu.menuChoice();
        }
        catch (IOException io)
        {
            System.out.println(" Неверный выбор пункта меню!");
        }
    }

}

