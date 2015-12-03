package Tests.misc;

import Objects.Agents.TerminalAgent;
import Objects.Lines.TerminalLine;
import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/24/15.
 */
public class temp {



    public static void main(String[] args) {


        TerminalLine terminalLine = new TerminalLine(new TerminalAgent());

        terminalLine.addPassenger(new Passenger());

        terminalLine.processPassenger();

        System.out.println("finished processing");
    }
}
