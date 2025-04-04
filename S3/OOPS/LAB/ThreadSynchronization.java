//program to perform thread synchronization
//Fayiza_28
Class Display {
    public synchronized void print(String str) {
        try {
                Thread.sleep(1000);
            System.out.println(“String is: “ + str);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
Class SyncThread extends Thread {
    Private Display d;
    Private String str;
  Public SyncThread(Display d, String str) {
        This.d = d;
        This.str = str;
    }
public void run() {
        d.print(str);
    }
}
Class Test {
    public static void main(String args[]) {
        Display d = new Display();
        SyncThread t1 = new SyncThread(d, “Hello”);
        SyncThread t2 = new SyncThread(d, “World”);
        t1.start();
        t2.start();
    }
}
OUTPUT
String is: Hello
String is: World

