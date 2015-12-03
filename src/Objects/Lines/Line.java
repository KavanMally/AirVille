package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Supervisor.Supervisor;
import Objects.Passenger.Passenger;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class Line {

    protected Queue<Passenger> line;
    private Agent agent;


    public Line(Agent agent){ this.agent = agent; }

    public void addPassenger(Passenger passenger) { line.add(passenger); }

    public Passenger getPassenger(){ return line.poll(); }

    public Agent getAgent(){ return agent; }




}
