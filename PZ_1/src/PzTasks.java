import java.util.Random;
import java.util.Scanner;

public class PzTasks {
    public void Task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int size = in.nextInt();
        int tab = size * 2 - 1;
        for (int i = 1; i < tab + 1; i = i + 2) {
            for (int j = i; j < tab; j++)
                System.out.print(" ");
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
    public void Task2() {
        double perem1 = 123.5;
        double perem2 = 333.15;
        System.out.println("Сумма двух вещественных переменных "+(perem1+perem2));
        System.out.println("Разность двух вещественных переменных "+(perem1-perem2));
        System.out.println("Произведение двух вещественных переменных "+(perem1*perem2));
    }
    public void Task3() {
        Random rand = new Random(System.currentTimeMillis());
        int[][] array = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                array[i][j] = rand.nextInt(10);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
        }
    }
    public void Task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строки");
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        String str4 = in.next();
        String str5 = in.next();
        String result;
        if(str4 == str5) {
            result = str1 + str2;
            System.out.println(result);
        }
        else {
            result = str1 + str3;
            System.out.println(result);
        }
        in.close();
    }
    public void Task5() {
        double[] a = {Math.pow(10,20), 1223, Math.pow(10,18), Math.pow(10,15), 3, Math.pow(-10,12)};
        double[] b = {Math.pow(10,20), 2, Math.pow(-10,22), Math.pow(10,13), 2111, Math.pow(10,16)};
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += a[i]*b[i];
        }
        System.out.println(sum);
    }

}
