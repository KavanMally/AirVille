package Tests.Lines;

import Objects.Agents.InPersonAgent;
import Objects.Lines.InPersonLine;
import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class InPersonLineTest {


    InPersonLine inPersonLine;
    Passenger passenger;

    Supervisor supervisor;

    @Before
    public void init(){

        inPersonLine = new InPersonLine(new InPersonAgent());
        passenger = new Passenger();
        supervisor = new Supervisor();

    }

    @Test
    public void testAddPassenger(){



        inPersonLine.addPassenger(passenger);

        assertEquals(passenger, inPersonLine.getPassenger());
    }

    @Test
    public void testGetPassenger(){


    }



}