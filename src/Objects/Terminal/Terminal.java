package Objects.Terminal;

/**
 * Created by kavan on 11/15/15.
 */
public class Terminal extends Thread {


    private long runTime;
    private final static long DEFAULT_VALUE = 1500;


    public Terminal(){

        runTime = DEFAULT_VALUE;
    }
    public Terminal(long runTime){
        this.runTime = runTime;
    }

    public void run(){
        try {
            Thread.sleep(runTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
