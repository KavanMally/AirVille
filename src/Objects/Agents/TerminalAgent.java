package Objects.Agents;

import Objects.Passenger.Passenger;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class TerminalAgent extends Agent {


    public TerminalAgent(){
        super();
    }

    public TerminalAgent(long timeOfProcess){
        super(timeOfProcess);
    }

    public void provideAssistance(Passenger passenger){


        //finished task
        this.actionSequence(passenger, getTimeToProcess());


    }
}
