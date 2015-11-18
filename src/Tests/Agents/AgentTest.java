package Tests.Agents;

import Objects.Agents.InPersonAgent;
import Objects.Agents.Supervisor;
import Objects.Agents.TerminalAgent;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/17/15.
 */
public class AgentTest {

    InPersonAgent inPersonAgent;
    TerminalAgent terminalAgent;
    Supervisor supervisor;


    @Before
    public void initialize(){


        inPersonAgent = new InPersonAgent();
        terminalAgent = new TerminalAgent();
        supervisor = new Supervisor();

    }

}