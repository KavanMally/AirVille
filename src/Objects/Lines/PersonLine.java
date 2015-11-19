package Objects.Lines;

import Objects.Agents.Agent;
import Objects.Passenger.Passenger;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kavan on 11/15/15.
 */
public class PersonLine extends Line {

    //private Comparator passengerComparator;

    public PersonLine(Agent agent){
        super(agent);

        //PriorityQueue<Passenger> line = new PriorityQueue<Passenger>();
        //passengerComparator = line.comparator();

        line = new PriorityQueue<>();
    }

    private void processPassenger(){
        Passenger passenger = line.poll();
        agent.actionSequence();
    }

}
