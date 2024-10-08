package modelo;

public class HelloFromThreads implements Runnable {

    int tdInt;

    public HelloFromThreads(int id) {
        this.tdInt = id;
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread " + this.tdInt);
    }

}
