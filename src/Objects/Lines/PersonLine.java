package Objects.Lines;

import Objects.Agents.Agent;

import java.util.PriorityQueue;

/**
 * Created by kavan on 11/15/15.
 */
public class PersonLine extends Line {


    public PersonLine(Agent agent){
        super(agent);
        line = new PriorityQueue();
    }

    private void processPassenger(){

    }
}
