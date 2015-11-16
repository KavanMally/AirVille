package Objects.Agents;

import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor {

    private float rateOfProcess;

    private final float DEFAULT_VALUE = (float)2.0;

    private int MAX_NUMBER_OF_SUPERVISORS = 1;

    public Supervisor(){
        rateOfProcess = DEFAULT_VALUE;
    }

    public Supervisor(float rateOfProcess){
        this.rateOfProcess = rateOfProcess;
    }


    public void moveSupervisor(Line line){

    }
}
