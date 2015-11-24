package Objects.Agents;

import Objects.Passenger.Passenger;

import java.util.Queue;

/**
 * Created by kavan on 11/15/15.
 * @goal Provide assistance to passengers in Automated Line
 */
public class TerminalAgent extends Agent {


    public TerminalAgent(){
        super();
    }

    public TerminalAgent(long timeOfProcess){
        super(timeOfProcess);
    }

    /**
     * Provide troubleshooting to passengers having trouble with terminal
     * @param passenger
     */
    public void provideAssistance(Passenger passenger){
        //this.actionSequence(passenger, getTimeToProcess());
        setActionLabel("Terminal agent providing technical assistance to passenger: ");
        System.out.println(getActionLabel() + modifyTimeToProcess(passenger) + " ms");
    }
}
