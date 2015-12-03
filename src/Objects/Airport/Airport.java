package Objects.Airport;

import Exceptions.AirportException;
import Objects.Agents.Agent;
import Objects.Agents.InPersonAgent;
import Objects.Agents.TerminalAgent;
import Objects.Lines.InPersonLine;
import Objects.Lines.TerminalLine;
import Objects.Supervisor.Supervisor;

import java.util.ArrayList;


/**
 * Created by kavan on 12/1/15.
 */
public class Airport {


    private long diamonds;
    private long points;

    private ArrayList<Supervisor> supervisorSet;

    private ArrayList<InPersonLine> inPersonLineSet;
    private ArrayList<TerminalLine> terminalLineSet;

    private int MAX_NUMBER_OF_SUPERVISORS = 1;



    public static Airport airport = null;

    /**
     * Private constructor prevents instantiation outside class
     */
    private Airport(){
        diamonds = 0;
        points = 0;

        supervisorSet = new ArrayList<>();

        inPersonLineSet = new ArrayList<>();
        terminalLineSet = new ArrayList<>();
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

        //check if operation would drop diamonds to negative zone
        if( (diamonds -= increment) < 0){
            throw new AirportException(AirportException.ErrorCode.INSUFFICIENT_FUNDS);
        }
    }

    public long getPoints(){ return points; }

    public long getDiamonds(){ return diamonds; }


    public void addInPersonLine(){
        InPersonAgent inPersonAgent = new InPersonAgent();
        inPersonLineSet.add(new InPersonLine(inPersonAgent));
    }

    public void addTerminalLine(){
        TerminalAgent terminalAgent = new TerminalAgent();
        terminalLineSet.add(new TerminalLine(terminalAgent));
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
