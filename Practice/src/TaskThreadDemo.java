/**
 * Created by sunl on 3/4/16.
 */
public class TaskThreadDemo {

    public static void main(String[] args) {

        //create tasks
        PrintChar printA = new PrintChar('a', 100);
        PrintChar printB = new PrintChar('b', 100);
        PrintNum print100 = new PrintNum(100);

        //create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        //start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrintChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {
        this.charToPrint = c;
        this.times = t;
    }

    public void run() {
        for(int i = 0; i < this.times; ++i) {
            System.out.print(this.charToPrint);
        }

    }
}

class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int n) {
        this.lastNum = n;
    }

    public void run() {
        for(int i = 1; i <= this.lastNum; ++i) {
            System.out.print(" " + i);
        }

    }
}
