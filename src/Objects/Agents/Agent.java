package Objects.Agents;

/**
 * Created by kavan on 11/15/15.
 */
public class Agent {


    final long DEFAULT_VALUE = 1000; //1 second

    long timeToProcess; //represented in milliseconds


    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }




    //assuming that any action in the game can be represented by a pause
    public void actionSequence(){
        try {
            Thread.sleep(timeToProcess);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
