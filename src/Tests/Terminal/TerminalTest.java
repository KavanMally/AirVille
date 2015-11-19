package Tests.Terminal;

import Objects.Terminal.Terminal;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/19/15.
 */
public class TerminalTest {


    Terminal terminal;

    @Before
    public void init(){

        terminal = new Terminal();
    }


    @Test
    public void start(){
        terminal.run();
    }
}
