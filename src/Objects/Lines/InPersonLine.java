package Objects.Lines;

import Exceptions.AgentException;
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

    Agent test;

    public InPersonLine(InPersonAgent agent){
        super(agent);
        this.agent = agent;
        line = new PriorityQueue<>();
    }

    /**
     * Move passenger from front of the line to processing booth
     */

    public void processPassenger() throws AgentException {
        Passenger passenger = getPassenger();
        agent.processTicket(passenger);

        test = new InPersonAgent();

    }

}
