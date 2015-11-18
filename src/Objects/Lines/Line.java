package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Passenger.Passenger;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class Line {

    Queue line;
    private boolean inUse; //possibly deprecated
    Agent agent;


    public Line(Agent agent){
        this.agent = agent;
    }

    public void addPassenger(Passenger passenger){

    }


}
