package Objects.Agents;

import Objects.Lines.Line;
import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/15/15.
 */
public class Agent {


    final long DEFAULT_VALUE = 10000; //1 second

    private long timeToProcess; //represented in milliseconds

    private static final int MODIFIER = 2;


    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }


    public long getTimeToProcess(){
        return timeToProcess;
    }



    //assuming that any action in the game can be represented by a pause
    public void actionSequence(Passenger passenger, long timeToProcess){

        long temp = modifyTimeToProcess(passenger);


        try {

            Thread.sleep(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public long modifyTimeToProcess(Passenger passenger){

        if(passenger.getSlowProcess())
            return timeToProcess / MODIFIER;
        else return timeToProcess;

    }


    public void waitForHelp(Line line){



    }


}
