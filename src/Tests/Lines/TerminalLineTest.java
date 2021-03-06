package Tests.Lines;

import Objects.Agents.TerminalAgent;
import Objects.Lines.TerminalLine;
import Objects.Passenger.Passenger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class TerminalLineTest {


    private TerminalLine terminalLine;
    private TerminalAgent terminalAgent;

    @Before
    public void init(){

        terminalAgent = new TerminalAgent();
        terminalLine = new TerminalLine(terminalAgent);

    }


    /**
     * Test that queue enters passenger FIFO with no reference to its isFrequentFlier
     * Tests addPassenger and getPassenger
     */
    @Test
    public void testQueueNaturalOrdering(){


        terminalLine = new TerminalLine(terminalAgent);

        terminalLine.addPassenger(new Passenger(true));
        terminalLine.addPassenger(new Passenger(false));

        Passenger passenger = terminalLine.getPassenger();

        assertTrue(passenger.getFrequentFlier());


    }

    @Test
    public void testQueuePriorityOrdering(){

        terminalLine = new TerminalLine(terminalAgent);


        terminalLine.addPassenger(new Passenger(false));
        terminalLine.addPassenger(new Passenger(false));
        terminalLine.addPassenger(new Passenger(true));

        Passenger passenger = terminalLine.getPassenger();
        assertFalse(passenger.getFrequentFlier());
    }

}