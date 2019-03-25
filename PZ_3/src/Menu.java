import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static Point p = new Point();
    public static Circle c = new Circle();
    public static Scanner input;

    public static int menuPrint() {
        input = new Scanner(System.in);
        int choice;

        System.out.println("                    ~~~~~~~~~МЕНЮ~~~~~~~~~~");
        System.out.println("1.           Хранение списков точек и окружностей");
        System.out.println("2.        Добавление данных в списки точек и окружостей");
        System.out.println("3.          Вывод на экран содержимого списка точек");
        System.out.println("4.       Вывод на экран содержимого списка окружностей");
        System.out.println("5.            Удаление из списка заданных точек");
        System.out.println("6.         Удаление из списка заданных окружностей");
        System.out.println("7. Вывод на экран точек, находящихся внутри хотя бы одной окружности");
        System.out.println("0.                   ~~~~~~~~ВЫХОД~~~~~~~~");
        System.out.println("                        Выберете пункт!");
        choice = input.nextInt();
        return choice;
    }

    public static void menuChoice() {

        int choice;
        do
        {
            choice = menuPrint();
            switch (choice)
            {
                case '1':

                    break;

                case '2':
                    break;

                /* TODO добавить далее все пункты! */

            }
        }while(choice != 0);
    }

    public static void main(String[] args) throws IOException {

        Menu.menuChoice();
    }

}

