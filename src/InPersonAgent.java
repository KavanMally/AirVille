/**
 * Created by kavan on 11/15/15.
 */
public class InPersonAgent extends Agent {

    private float rateOfProcess;

    private final float DEFAULT_VALUE = (float)1.0;

    public InPersonAgent(){
        rateOfProcess = DEFAULT_VALUE;
    }

    public  InPersonAgent(float rateOfProcess){
        this.rateOfProcess = rateOfProcess;
    }


    public void processTicket(Passenger passenger){

    }

}
