package Tests.Agents;

import Exceptions.AgentException;
import Objects.Agents.InPersonAgent;
import Objects.Agents.Terminal;
import Objects.Passenger.Passenger;
import Objects.Supervisor.Supervisor;
import Objects.Agents.TerminalAgent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/17/15.
 */
public class AgentTest {

    InPersonAgent inPersonAgent;
    TerminalAgent terminalAgent;
    Terminal terminal;

    Supervisor supervisor;

    Passenger passenger;
    Passenger passenger1;


    @Before
    public void initialize(){


        inPersonAgent = new InPersonAgent();
        terminalAgent = new TerminalAgent();
        terminal = new Terminal(terminalAgent);

        supervisor = new Supervisor();

        passenger = new Passenger(true, true, true, true, true);

        passenger1 = new Passenger(false, false, false, false, true);


    }




    @Test
    public void testPairWithSupervisor() throws AgentException {

        inPersonAgent.pairUpWithSupervisor(supervisor);
        assertTrue(inPersonAgent.getPairedWithSupervisor());

        terminal.pairUpWithSupervisor(supervisor);
        assertTrue(terminal.getPairedWithSupervisor());
    }

    @Test
    public void testSeparateFromSupervisor() throws AgentException {

        inPersonAgent.pairUpWithSupervisor(supervisor);
        inPersonAgent.separateFromSupervisor();
        assertTrue(!inPersonAgent.getPairedWithSupervisor());

        terminal.pairUpWithSupervisor(supervisor);
        terminal.separateFromSupervisor();
        assertTrue(!terminal.getPairedWithSupervisor());
    }

    @Test
    public void testModifyTimeToProcess() throws AgentException {

        long comp1 = inPersonAgent.modifyTimeToProcess(passenger);
        assertEquals(inPersonAgent.actionSequence(passenger), comp1);

    }

    @Test
    public void testModifyTimeToProcess1() throws AgentException {

        long comp1 = inPersonAgent.modifyTimeToProcess(passenger1);
        assertEquals(inPersonAgent.actionSequence(passenger1), comp1);
    }

}