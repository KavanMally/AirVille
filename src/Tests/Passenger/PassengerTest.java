package Tests.Passenger;

import Objects.Agents.TerminalAgent;
import Objects.Lines.TerminalLine;
import Objects.Passenger.Passenger;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/19/15.
 */
public class PassengerTest {

    Passenger passenger;
    TerminalLine terminalLine;

    @Before
    public void init(){

        passenger = new Passenger();
        terminalLine = new TerminalLine(new TerminalAgent());

    }

    @Test
    public void testEnterLine(){


        passenger.enterLine(terminalLine);
        assertEquals(passenger, terminalLine.getPassenger());



    }
}
