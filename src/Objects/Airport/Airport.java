package Objects.Airport;

import Exceptions.AirportException;
import Objects.Agents.Agent;
import Objects.Lines.InPersonLine;
import Objects.Lines.TerminalLine;
import Objects.Supervisor.Supervisor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kavan on 12/1/15.
 */
public class Airport {

    //todo: remove unused imports
    //Can you keep track of all the agents, supervisors, counters, etc that the player currently owns.  All the things like that.

    private long diamonds;
    private long points;

    private Set<Agent> agentSet;
    private Set<Supervisor> supervisorSet;

    private Set<InPersonLine> inPersonLineSet;
    private Set<TerminalLine> terminalLineSet;

    private int MAX_NUMBER_OF_SUPERVISORS = 1;



    public static Airport airport = null;

    /**
     * Private constructor prevents instantiation outside class
     */
    private Airport(){
        diamonds = 0;
        points = 0;

        agentSet = new HashSet<>();
        supervisorSet = new HashSet<>();

        inPersonLineSet = new HashSet<>();
        terminalLineSet = new HashSet<>();
    }


    public static Airport getAirport(){
        if(airport == null)
            airport = new Airport();
        return airport;
    }

    /**
     * Increases player's points value
     * Default method increases by 1
     */
    public void incrementPoints(){
        points++;
    }

    /**
     * Increases player's point value
     * @param increment Value by which to increase points
     */
    public void incrementPoints(long increment){
        points += increment;
    }

    public void increaseDiamonds(){
        diamonds++;
    }

    public void increaseDiamonds(long increment){
        diamonds += increment;
    }

    public void decreaseDiamonds(long increment) throws AirportException {

        //check if operation would drop diamonds to negative zone, if so undo operation
        if( (diamonds -= increment) < 0){
            throw new AirportException(AirportException.ErrorCode.INSUFFICIENT_FUNDS);
        }
    }

    public void addAgent(){
        agentSet.add(new Agent());
    }

    public void addAgent(long timeToProcess){
        agentSet.add(new Agent(timeToProcess));
    }

    public void removeAgent(Agent agent){
        agentSet.remove(agent);
    }

    public void increaseMaxNumberOfSupervisors(){
        MAX_NUMBER_OF_SUPERVISORS++;
    }


    public void addSupervisor() throws AirportException {

        if(supervisorSet.size() <= MAX_NUMBER_OF_SUPERVISORS)
            supervisorSet.add(new Supervisor());
        else {
            throw new AirportException(AirportException.ErrorCode.TOO_MANY_SUPERVISORS);
        }

    }



}
