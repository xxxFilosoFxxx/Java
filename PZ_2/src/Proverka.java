public class Proverka {
    public static void main (String[] args)
    {
    /*    Point p1 = new Point(2,5);
        Point p2 = new Point(2,5);
        Point p3 = new Point(10,15);

        System.out.println(p3.toString());
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        p3 = p1;
        System.out.println(p1.equals(p3));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); */

        Point p4 = new Point(1,2);
        Point p5 = new Point(1.4,2.1);
        Point p6 = new Point(-2.1,0.5);
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Circle c1 = new Circle(2,0,1);
        Circle c2 = new Circle(1.6,2,2);
        Circle c3 = new Circle(-1.2,-2,2.5);
        System.out.println(c1.square());
        System.out.println(c2.square());
        System.out.println(c3.square());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        IDrawable[] proba = new IDrawable[6];
        proba[0] = p4;
        proba[1] = p5;
        proba[2] = p6;
        proba[3] = c1;
        proba[4] = c2;
        proba[5] = c3;
        for(int i = 0; i<6; i++)
        {
            proba[i].draw();
        }


    }
}
