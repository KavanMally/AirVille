package Objects.Agents;

import Objects.Agents.Agent;

/**
 * Created by kavan on 11/15/15.
 */
public class Terminal extends Agent {


    private final static long DEFAULT_VALUE = 1500;



    public Terminal(){

        timeToProcess = DEFAULT_VALUE;
    }
    public Terminal(long runTime){
        timeToProcess = runTime;
    }

    public void processTicket(){
        super.actionSequence();

    }



}
