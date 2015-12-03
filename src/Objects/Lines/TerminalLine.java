package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Agents.TerminalAgent;
import Objects.Passenger.Passenger;
import Objects.Agents.Terminal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kavan on 11/15/15.
 */
public class TerminalLine extends Line {

    private Terminal terminal;


    public TerminalLine(TerminalAgent agent){
        super(agent);
        line = new LinkedList<>();
        terminal = new Terminal(agent);

    }

    public void processPassenger(){

        Passenger passenger = getPassenger();

        terminal.processTicket(passenger);

    }


}
