package Tests.Lines;

import Objects.Agents.InPersonAgent;
import Objects.Lines.PersonLine;
import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/24/15.
 */
public class PersonLineTest {


    PersonLine personLine;
    Passenger passenger;

    Supervisor supervisor;

    @Before
    public void init(){

        personLine = new PersonLine(new InPersonAgent());
        passenger = new Passenger();

    }

    @Test
    public void testAddPassenger(){



        personLine.addPassenger(passenger);

        assertEquals(passenger, personLine.getPassenger());
    }

    @Test
    public void tetstGetPassenger(){


    }

    @Test
    public void testAcceptSupervisor(){
        personLine.acceptSupervisor(supervisor);

        assertTrue(personLine.getHasSupervisor());
    }


}