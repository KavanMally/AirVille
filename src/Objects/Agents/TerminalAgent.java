package Objects.Agents;

import Objects.Agents.Agent;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class TerminalAgent extends Agent {

    private float rateOfProcess;
    private Queue helpLine;


    private final float DEFAULT_VALUE = (float) 1.0;


    public TerminalAgent(){
        rateOfProcess = DEFAULT_VALUE;
    }

    public TerminalAgent(float rateOfProcess){
        this.rateOfProcess = rateOfProcess;
    }


    public void provideAssistance(Terminal terminal){

    }
}
