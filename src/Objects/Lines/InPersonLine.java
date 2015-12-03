package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Agents.InPersonAgent;
import Objects.Passenger.Passenger;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kavan on 11/15/15.
 */
public class InPersonLine extends Line {

    InPersonAgent agent;


    public InPersonLine(InPersonAgent agent){
        super(agent);
        this.agent = agent;
        line = new PriorityQueue<>();
    }

    /**
     * Move passenger from front of the line to processing booth
     */

    //TODO: abstract by assigning agent to terminal
    public void processPassenger(){
        Passenger passenger = getPassenger();
        agent.processTicket(passenger);
    }

}
