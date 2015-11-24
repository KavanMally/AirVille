package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Agents.InPersonAgent;
import Objects.Passenger.Passenger;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kavan on 11/15/15.
 */
public class PersonLine extends Line {

    InPersonAgent agent;


    public PersonLine(InPersonAgent agent){
        super(agent);
        this.agent = agent;
        line = new PriorityQueue<>();
    }

    /**
     * Move passenger from front of the line to processing booth
     */
    private void processPassenger(){
        Passenger passenger = getPassenger();
        agent.processTicket(passenger);
    }

}
