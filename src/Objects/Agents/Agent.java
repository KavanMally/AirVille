package Objects.Agents;

import Exceptions.AgentException;
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

    private Supervisor pairedSupervisor = null;

    private boolean busy; //indicates whether agent is handling passenger

    private String actionLabel; //string to be displayed on println

    public Agent(){
        timeToProcess = DEFAULT_VALUE;
    }

    public Agent(long timeToProcess){
        this.timeToProcess = timeToProcess;
    }

    //assuming that any action in the game can be represented by a pause

    /**
     * Returns long value of time needed for agent to complete action
     * Will be simulated by real-time team
     * @param passenger to whom action is directed towards
     * @return long time in milliseconds
     */
    public long actionSequence(Passenger passenger) throws AgentException {

        long temp = modifyTimeToProcess(passenger);

        if(passenger.getRequireManager()) throw new AgentException(AgentException.ErrorCode.SUPERVISOR_REQUIRED_FOR_OPERATION);
        return temp;

    }


    /**
     * Pairs up agent with supervisor, allowing it to process passengers requiring
     * supervisors and decrease timeToProcess
     * @param supervisor
     */
    public void pairUpWithSupervisor(Supervisor supervisor) throws AgentException{


        if(supervisor.getBusy()){
            throw new AgentException(AgentException.ErrorCode.SUPERVISOR_NOT_AVAILABLE);
        }

        pairedSupervisor = supervisor;
        pairedWithSupervisor = true;
        pairedSupervisor.setBusy(true);
        timeToProcess /= supervisor.getMODIFIER();

    }

    /**
     * Removes supervisor from agent, returning timeToProcess to normal levels
     */
    public void separateFromSupervisor(){

        if(pairedWithSupervisor){
            timeToProcess *= pairedSupervisor.getMODIFIER();
            pairedWithSupervisor = false;
            pairedSupervisor.setBusy(false);
            pairedSupervisor = null;
        }

        //if false then nothing happens as no supervisor is actually paired to this agent

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
     * @return busy
     */
    public boolean getBusy(){ return busy;}

    public void setBusy(boolean busy){ this.busy = busy; }

    public void setActionLabel(String string){ actionLabel = string;}
    public String getActionLabel(){ return actionLabel; }

    public boolean getPairedWithSupervisor(){ return pairedWithSupervisor;}


}
