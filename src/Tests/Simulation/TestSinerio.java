package Tests.Simulation;

import Objects.Agents.InPersonAgent;
import Objects.Agents.Terminal;
import Objects.Agents.TerminalAgent;
import Objects.Lines.AutomatedLine;
import Objects.Lines.PersonLine;
import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class TestSinerio {



    private AutomatedLine automatedLine;
    private PersonLine personLine;

    private Supervisor supervisor;

    private Terminal terminal;
    private InPersonAgent inPersonAgent;
    private TerminalAgent terminalAgent;



    @Before
    public void init(){


        automatedLine = new AutomatedLine(terminalAgent);
        personLine = new PersonLine(inPersonAgent);

    }

    @Test
    public void quickRun(){

        for(int x = 0; x < 10; x++){
            automatedLine.addPassenger(new Passenger());
            personLine.addPassenger(new Passenger());
        }

        for(int x = 0; x < 10; x++){
            automatedLine.processPassenger();
            personLine.processPassenger();
        }
    }

}
