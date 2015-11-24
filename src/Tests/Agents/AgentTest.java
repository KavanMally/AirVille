package Tests.Agents;

import Objects.Agents.InPersonAgent;
import Objects.Supervisor.Supervisor;
import Objects.Agents.TerminalAgent;
import org.junit.Before;

/**
 * Created by kavan on 11/17/15.
 */
public class AgentTest {

    InPersonAgent inPersonAgent;
    TerminalAgent terminalAgent;
    Supervisor supervisor;


    //todo create more tests

    @Before
    public void initialize(){


        inPersonAgent = new InPersonAgent();
        terminalAgent = new TerminalAgent();
        supervisor = new Supervisor();

    }

}