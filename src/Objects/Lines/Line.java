package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Supervisor.Supervisor;
import Objects.Passenger.Passenger;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 */
public class Line {

    Queue<Passenger> line;
    private boolean inUse; //possibly deprecated
    private Agent agent;
    private boolean hasSupervisor;

    Supervisor supervisor;

    public Line(Agent agent){ this.agent = agent; }

    public void addPassenger(Passenger passenger) { line.add(passenger); }

    public Passenger getPassenger(){ return line.poll(); }

    public Agent getAgent(){ return agent; }

    public void acceptSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
        hasSupervisor = true;
        agent.pairUpWithSupervisor(supervisor);
    }

    public void removeSupervisor(){
        supervisor = null;
        hasSupervisor = false;
        agent.separateFromSupervisor();
    }








}
