package Objects.Agents;

import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor extends Agent {


    //TODO: remove from Agent superclass, does not function same as normal agent
    //more of a facilitator than a doer

    private final static long DEFAULT_VALUE = 5000; //default value unique to Supervisor
    private int MAX_NUMBER_OF_SUPERVISORS = 1;
    private boolean inLine;

    private int MODIFIER = 2;

    public Supervisor(){
        super(DEFAULT_VALUE);
    }

    /**
     * Warning! Possible to create supervisor with work rate slower than normal agents
     * @param timeOfProcess
     */
    public Supervisor(long timeOfProcess){
        super(timeOfProcess);
    }

    //TODO fill in
    public void moveSupervisor(Line line){


    }


    public void sideLine(){
        inLine = false;
    }


    public void setInLine(boolean inLine){ this.inLine = inLine;}

    public boolean getInLine(){ return inLine;}

    public int getMODIFIER(){ return MODIFIER; }
}
