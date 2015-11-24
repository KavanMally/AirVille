package Objects.Agents;

import Objects.Agents.Agent;
import Objects.Passenger.Passenger;


/**
 * Created by kavan on 11/15/15.
 * @goal personally process tickets at PersonLine
 */
public class InPersonAgent extends Agent {



    public InPersonAgent(){
        super();
    }

    public InPersonAgent(long timeOfProcess){
        super(timeOfProcess);
    }


    /**
     * Processes passenger's ticket
     * Mostly a stub to provide interface for actual processing of tickets
     * @param passenger to process
     */
    public void processTicket(Passenger passenger){
        actionSequence(passenger, getTimeToProcess());
    }

}
