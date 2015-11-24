package Objects.Agents;

import Objects.Lines.Line;
import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/15/15.
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





    public void processTicket(Passenger passenger){

        if(passenger.getNeedTechSupport()){
            requestAssistance(passenger);
        }

        super.actionSequence(passenger, getTimeToProcess());
    }


    public void redirectPassenger(Passenger passenger, Line line){
        line.addPassenger(passenger);
    }


    private void requestAssistance(Passenger passenger) {
        terminalAgent.provideAssistance(passenger);
    }


}
