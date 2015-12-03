package Tests.Simulation;

import Objects.Agents.InPersonAgent;
import Objects.Agents.Terminal;
import Objects.Agents.TerminalAgent;
import Objects.Lines.TerminalLine;
import Objects.Lines.InPersonLine;
import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class TestSinerio {



    private TerminalLine terminalLine;
    private InPersonLine inPersonLine;

    private Supervisor supervisor;

    private Terminal terminal;
    private InPersonAgent inPersonAgent;
    private TerminalAgent terminalAgent;



    @Before
    public void init(){


        terminalLine = new TerminalLine(terminalAgent);
        inPersonLine = new InPersonLine(inPersonAgent);

    }

    @Test
    public void quickRun(){

        for(int x = 0; x < 10; x++){
            terminalLine.addPassenger(new Passenger());
            inPersonLine.addPassenger(new Passenger());
        }

        for(int x = 0; x < 10; x++){
            terminalLine.processPassenger();
            inPersonLine.processPassenger();
        }
    }

}
