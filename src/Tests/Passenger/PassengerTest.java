package Tests.Passenger;

import Objects.Agents.TerminalAgent;
import Objects.Lines.AutomatedLine;
import Objects.Passenger.Passenger;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/19/15.
 */
public class PassengerTest {

    Passenger passenger;
    AutomatedLine automatedLine;

    @Before
    public void init(){

        passenger = new Passenger();
        automatedLine = new AutomatedLine(new TerminalAgent());

    }

    @Test
    public void testEnterLine(){


        passenger.enterLine(automatedLine);
        assertEquals(passenger, automatedLine.getPassenger());



    }
}
