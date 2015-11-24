package Tests.Agents;

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



    @Before
    public void initialize(){


        inPersonAgent = new InPersonAgent();
        terminalAgent = new TerminalAgent();
        terminal = new Terminal(terminalAgent);

        supervisor = new Supervisor();

        passenger = new Passenger();

    }


    @Test
    public void testCheckPassenger(){

        boolean needManager = passenger.getRequireManager();

        //todo: fix, instead of calling thread.sleep, you can refuse all operations until boolean is fixed
        //inPersonAgent.checkPassenger();
        //assertEquals(needManager, inPersonAgent.checkPassenger(passenger));

    }


    @Test
    public void testPairWithSupervisor(){

        inPersonAgent.pairUpWithSupervisor(supervisor);
        assertTrue(inPersonAgent.getPairedWithSupervisor());

        terminal.pairUpWithSupervisor(supervisor);
        assertTrue(terminal.getPairedWithSupervisor());
    }

    @Test
    public void testSeparateFromSupervisor(){

        inPersonAgent.pairUpWithSupervisor(supervisor);
        inPersonAgent.separateFromSupervisor();
        assertTrue(!inPersonAgent.getPairedWithSupervisor());

        terminal.pairUpWithSupervisor(supervisor);
        terminal.separateFromSupervisor();
        assertTrue(!terminal.getPairedWithSupervisor());
    }

    @Test
    public void testModifyTimeToProcess(){

        long comp1 = inPersonAgent.modifyTimeToProcess(passenger);
        long comp2 = inPersonAgent.getTimeToProcess();
        int temp;
        if(passenger.getSlowProcess()) temp = 2;
        else temp = 1;

        assertEquals(comp1, comp2 * temp);



    }

}