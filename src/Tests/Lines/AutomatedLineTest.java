package Tests.Lines;

import Objects.Agents.TerminalAgent;
import Objects.Lines.AutomatedLine;
import Objects.Passenger.Passenger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class AutomatedLineTest {


    private AutomatedLine automatedLine;
    private TerminalAgent terminalAgent;

    @Before
    public void init(){

        terminalAgent = new TerminalAgent();
        automatedLine = new AutomatedLine(terminalAgent);

    }


    /**
     * Test that queue enters passenger FIFO with no reference to its isFrequentFlier
     * Tests addPassenger and getPassenger
     */
    @Test
    public void testQueue(){

        automatedLine.addPassenger(new Passenger(true));
        automatedLine.addPassenger(new Passenger(false));

        Passenger passenger = automatedLine.getPassenger();

        assertTrue(passenger.getFrequentFlier());
        automatedLine = new AutomatedLine(terminalAgent);

        automatedLine.addPassenger(new Passenger(false));
        automatedLine.addPassenger(new Passenger(true));

        assertFalse(passenger.getFrequentFlier());

    }

}