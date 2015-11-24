package Objects.Agents;

import Objects.Lines.Line;
import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/15/15.
 */
public class Agent {


    private final long DEFAULT_VALUE = 10000; //1 second

    private long timeToProcess; //represented in milliseconds

    private static final int MODIFIER = 2;

    private boolean pairedWithSupervisor;

    private final long checkFrequency = 1;

    private Supervisor pairedSupervisor = null;


    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }


    public long getTimeToProcess(){
        return timeToProcess;
    }



    public void checkPassenger(Passenger passenger){

        if(passenger.getRequireManager()){
            waitForHelp();
        }
    }


    public void pairUpWithSupervisor(Supervisor supervisor){

        pairedSupervisor = supervisor;

        pairedWithSupervisor = true;



        timeToProcess /= supervisor.getMODIFIER();
    }

    public void separateFromSupervisor(){

        timeToProcess *= pairedSupervisor.getMODIFIER();

        pairedWithSupervisor = false;


        pairedSupervisor = null;

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
            return timeToProcess * MODIFIER;
        else return timeToProcess;

    }


    public void waitForHelp(){

        while(!pairedWithSupervisor){
            try {
                Thread.sleep(checkFrequency);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
