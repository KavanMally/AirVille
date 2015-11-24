package Tests.Agents;

import Objects.Agents.InPersonAgent;
import Objects.Agents.Terminal;
import Objects.Supervisor.Supervisor;
import Objects.Agents.TerminalAgent;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/17/15.
 */
public class AgentTest {

    InPersonAgent inPersonAgent;
    TerminalAgent terminalAgent;
    Terminal terminal;



    @Before
    public void initialize(){


        inPersonAgent = new InPersonAgent();
        terminalAgent = new TerminalAgent();
        terminal = new Terminal(terminalAgent);

    }


    @Test
    public void superclassTest(){


    }

}