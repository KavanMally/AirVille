package Objects.Agents;

import Objects.Lines.Line;
import Objects.Passenger.Passenger;

import java.util.Random;

/**
 * Created by kavan on 11/15/15.
 * @goal facilitate ticket processing done by terminal
 */
public class Terminal extends Agent {


    private final static long DEFAULT_VALUE = 5000; //default value which should be lower than normal agent
    private TerminalAgent terminalAgent; //agent assigned to troubleshoot this terminal

    public Terminal(TerminalAgent terminalAgent){

        super(DEFAULT_VALUE);
        this.terminalAgent = terminalAgent;
    }
    public Terminal(TerminalAgent terminalAgent, long timeToProcess){
        super(timeToProcess);
        this.terminalAgent = terminalAgent;
    }


    /**
     * Process passenger's ticket, if it requires tech support, call on agent's assist method
     * else run agent's actionSequence
     * @param passenger to process
     */
    public void processTicket(Passenger passenger){

        if(passenger.getNeedTechSupport())
            requestAssistance(passenger);
        else
            super.actionSequence(passenger, getTimeToProcess());
    }


    /**
     * Move passenger from terminal line to desired line
     * @param passenger
     * @param line
     */
    public void redirectPassenger(Passenger passenger, Line line){
        line.addPassenger(passenger);
    }

    /**
     * Calls on agent supervising this terminal to provide assistance processing ticket
     * @param passenger
     */
    private void requestAssistance(Passenger passenger) {
        terminalAgent.provideAssistance(passenger);
    }


}
