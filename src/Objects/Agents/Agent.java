package Objects.Agents;

import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;

/**
 * Created by kavan on 11/15/15.
 */
public class Agent {


    private final long DEFAULT_VALUE = 10000; //10 second

    private long timeToProcess; //represented in milliseconds
    private boolean pairedWithSupervisor;

    private final long checkFrequency = 1;

    private Supervisor pairedSupervisor = null;


    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }

    //assuming that any action in the game can be represented by a pause
    public void actionSequence(Passenger passenger, long timeToProcess){

        checkPassenger(passenger);

        long temp = modifyTimeToProcess(passenger);


        try {

            Thread.sleep(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void waitForHelp(){

        while(!pairedWithSupervisor){
            try {
                Thread.sleep(checkFrequency);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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


    public long modifyTimeToProcess(Passenger passenger){

        if(passenger.getSlowProcess())
            return timeToProcess * passenger.getMODIFIER();
        else return timeToProcess;

    }


    public long getTimeToProcess(){
        return timeToProcess;
    }



}
