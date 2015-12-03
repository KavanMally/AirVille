package Objects.Agents;

import Exceptions.AgentException;
import Objects.Agents.Agent;
import Objects.Passenger.Passenger;


/**
 * Created by kavan on 11/15/15.
 * @goal personally process tickets at InPersonLine
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
    public void processTicket(Passenger passenger) throws AgentException {
        setBusy(true);
        long time = actionSequence(passenger);
        setActionLabel("InPersonAgent processing passenger's ticket: ");
        System.out.println( getActionLabel() + time + " ms");
        setBusy(false);
    }

}
