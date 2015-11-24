package Tests.misc;

import Objects.Agents.TerminalAgent;
import Objects.Lines.AutomatedLine;
import Objects.Passenger.Passenger;

/**
 * Created by kavan on 11/24/15.
 */
public class temp {



    public static void main(String[] args) {


        AutomatedLine automatedLine = new AutomatedLine(new TerminalAgent());

        automatedLine.addPassenger(new Passenger());

        automatedLine.processPassenger();

        System.out.println("finished processing");
    }
}
