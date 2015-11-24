package Objects.Agents;

import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;

/**
 * Created by kavan on 11/15/15.
 * @goal Facilitate ticket processing at designated workstation
 */
public class Agent {


    private final long DEFAULT_VALUE = 10000; //10 second

    private long timeToProcess; //represented in milliseconds
    private boolean pairedWithSupervisor; //is supervisor paired with this agent

    private final long checkFrequency = 1; //how often to check if supervisor is not paired

    private Supervisor pairedSupervisor = null;

    private boolean busy; //indicates whether agent is handling passenger


    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }

    //assuming that any action in the game can be represented by a pause

    /**
     * Emulates the time spend on a given action (processing ticket, troubleshooting)
     * @param passenger to whom action is directed towards
     * @param timeToProcess how long it will take (unit milliseconds)
     */
    public void actionSequence(Passenger passenger, long timeToProcess){

        checkPassenger(passenger); //checks if require supervisor

        long temp = modifyTimeToProcess(passenger);


        //System.out.println("Processing passenger");

        //System.out.println("[" + LineType + "] processing passenger");
        //System.out.println("[" + Agent + "providing tech support");

        /*
        try {
            Thread.sleep(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

    }

    /**
     * Checks whether a supervisor is required to process passenger
     * @param passenger to whom is being checked
     */
    public void checkPassenger(Passenger passenger){

        if(passenger.getRequireManager()){
            waitForHelp();
        }
    }

    /**
     * Agent sleeps until Supervisor moves to its line, ending sleep cycle
     */
    private void waitForHelp(){

        while(!pairedWithSupervisor){
            try {
                Thread.sleep(checkFrequency);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Pairs up agent with supervisor, allowing it to process passengers requiring
     * supervisors and decrease timeToProcess
     * @param supervisor
     */
    public void pairUpWithSupervisor(Supervisor supervisor){

        pairedSupervisor = supervisor;

        pairedWithSupervisor = true;



        timeToProcess /= supervisor.getMODIFIER();
    }

    /**
     * Removes supervisor from agent, returning timeToProcess to normal levels
     */
    public void separateFromSupervisor(){

        timeToProcess *= pairedSupervisor.getMODIFIER();

        pairedWithSupervisor = false;


        pairedSupervisor = null;

    }


    /**
     * Checks if passenger is a slow process, if so return process time multiplied
     * by passenger's modifier
     * @param passenger in question
     * @return
     */
    public long modifyTimeToProcess(Passenger passenger){

        if(passenger.getSlowProcess())
            return timeToProcess * passenger.getMODIFIER();
        else return timeToProcess;

    }

    /**
     * Getter method
     * @return timeToProcess
     */
    public long getTimeToProcess(){
        return timeToProcess;
    }

    /**
     * Getter method
     * @return busy
     */
    public boolean getBusy(){ return busy;}

    public void setBusy(boolean busy){ this.busy = busy; }


}
