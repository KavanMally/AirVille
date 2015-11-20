package Objects.Agents;

import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/15/15.
 */
public class Terminal extends Agent {


    private final static long DEFAULT_VALUE = 1500;



    public Terminal(){

        super(DEFAULT_VALUE);
    }
    public Terminal(long runTime){
        super(runTime);
    }





    public void processTicket(Passenger passenger){

        if(passenger.getNeedTechSupport()){
            requestAssistance(passenger);
        }



        super.actionSequence(passenger, getTimeToProcess());





    }


    public void redirectPassenger(Passenger passenger){

    }


    private void requestAssistance(Passenger passenger) {

    }


}
