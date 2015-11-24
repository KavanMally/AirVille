package Tests.Passenger;

import Objects.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kavan on 11/19/15.
 */
public class PassengerTest {

    Passenger passenger;


    @Before
    public void init(){

        passenger = new Passenger();



    }

    @Test
    public void test(){
        System.out.println("wait 1 sec");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
