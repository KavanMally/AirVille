package Objects.Passenger;

import java.util.Random;

/**
 * Created by kavan on 11/15/15.
 */
public class Passenger {

    private boolean isFrequentFlier;
    private boolean slowProcess;
    private boolean requireManager;

    private Random random;

    public Passenger(){

        random = new Random();
        randomIsFrequentFlier(random.nextBoolean());
        randomSlowProcess(random.nextBoolean());
        randomRequireManager(random.nextBoolean());

    }

    private void randomIsFrequentFlier(boolean random){
        isFrequentFlier = random;
    }

    private void randomSlowProcess(boolean random){
        slowProcess = random;
    }

    private void randomRequireManager(boolean random){
        requireManager = random;
    }



    public boolean getFrequentFlier(){ return isFrequentFlier; }
    public boolean getSlowProcess(){ return slowProcess; }
    public boolean getRequireManager(){ return requireManager; }
}
