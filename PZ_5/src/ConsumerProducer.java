import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConsumerProducer  {
    private BlockingQueue<Point> queue;
    private Point p;
    private final Point exampleForQueue = new Point(11,11);
    private Scanner in;
    private int j = -1;
    private Thread threadProducer;
    private Thread threadConsumer;

    ConsumerProducer()
    {
        p = new Point();
        p.generateListPoints();
        p.setInterval();
        p.add_points();
        p.printPoints();
        queue = new ArrayBlockingQueue(1,true);
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        threadProducer = new Thread(producer);
        threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();
        System.out.println("Введите, на каком элементе остановить поток `Производителя`:");
        in = new Scanner(System.in);
        j = in.nextInt();
    }

    public class Producer implements Runnable {
        @Override
        public void run()
        {
            try
            {
                for (int i = 0; i < p.getInterval(); i++)
                {
                    int time = (int) (Math.random()*9900 + 100);
                    Thread.sleep(time);
                    if (j == i)
                    {
                        threadProducer.interrupt();
                    }
                    queue.put(p.getListPoints().get(i));
                }
                queue.put(exampleForQueue);
            }
            catch (InterruptedException ex)
            {
                System.err.println(ex.getMessage());
                threadConsumer.interrupt();
            }
        }
    }

    public class Consumer implements Runnable {
        @Override
        public void run()
        {
            try
            {

                Point forQueue;
                while (!((forQueue = queue.take()).equals(exampleForQueue)))
                {
                    double c = Math.sqrt(Math.pow(forQueue.getX(), 2) + Math.pow(forQueue.getY(), 2));
                    System.out.println("x: " + forQueue.getX() + "\ty: " + forQueue.getY() + "\tdistance: " + c);
                }

            }
            catch (InterruptedException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ConsumerProducer();
    }

}
