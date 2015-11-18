package Objects.Lines;

import Objects.Agents.Agent;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class AutomatedLine extends Line {


    private static final int TERMINALS_PER_AGENT = 50; //default, can be changed
    private int numberOfTerminals;

    private Queue availableTerminal;


    public AutomatedLine(Agent agent){
        super(agent);
    }


}
