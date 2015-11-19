package Objects.Agents;

import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor extends Agent {

    private final static long DEFAULT_VALUE = 2000; //default value unique to Supervisor
    private int MAX_NUMBER_OF_SUPERVISORS = 1;

    public Supervisor(){
        super(DEFAULT_VALUE);
    }

    /**
     * Warning! Possible to create supervisor with work rate slower than normal agents
     * @param timeOfProcess
     */
    public Supervisor(long timeOfProcess){
        this.timeToProcess = timeOfProcess;
    }

    //TODO fill in
    public void moveSupervisor(Line line){

    }
}
