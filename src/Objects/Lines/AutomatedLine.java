package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Passenger.Passenger;
import Objects.Agents.Terminal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class AutomatedLine extends Line {

    private Terminal terminal;


    public AutomatedLine(Agent agent){
        super(agent);
        line = new LinkedList<>();


    }

    public void processPassenger(){

        Passenger passenger = getPassenger();

        terminal.processTicket(passenger);

    }


}
