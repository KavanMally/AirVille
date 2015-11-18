package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Agents.InPersonAgent;
import Objects.Terminal.Terminal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class AutomatedLine extends Line {


    private static final int TERMINALS_PER_AGENT = 50; //default, can be changed
    private int numberOfTerminals;

    private Queue<Terminal> availableTerminal;


    public AutomatedLine(Agent agent){
        super(agent);
        line = new LinkedList<>();
        numberOfTerminals = TERMINALS_PER_AGENT;
        availableTerminal = new LinkedList<>();
        availableTerminal.addAll(createMultipleTerminals());

    }

    public void processPassenger(){


    }

    private Terminal removeAvailableTerminal(){
        return availableTerminal.poll();
    }

    public void addAvailableTerminal(Terminal terminal){
        availableTerminal.add(terminal);
    }


    private ArrayList<Terminal> createMultipleTerminals(){

        ArrayList<Terminal> list = new ArrayList<>();

        for(int setCounter = 0; setCounter < numberOfTerminals; setCounter++)
            list.add(new Terminal());


        return list;
    }

}
