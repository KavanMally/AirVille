package Objects.Agents;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class TerminalAgent extends Agent {

    private Queue helpLine;


    public TerminalAgent(){
        super();
    }

    public TerminalAgent(long timeOfProcess){
        super(timeOfProcess);
    }

    //TODO fill in
    public void provideAssistance(Terminal terminal){


        //finished task
        this.actionSequence();


    }
}
