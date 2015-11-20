package Objects.Passenger;

import Objects.Lines.Line;

import java.util.Random;

/**
 * Created by kavan on 11/15/15.
 */
public class Passenger implements Comparable<Passenger> {

    private boolean isFrequentFlier;
    private boolean slowProcess;
    private boolean requireManager;
    private boolean needTechSupport;

    private Random random;

    public Passenger(){

        random = new Random();
        randomIsFrequentFlier();
        randomSlowProcess();
        randomRequireManager();
        randomNeedTechSupport();
    }


    public void enterLine(Line line){

    }


    private void randomIsFrequentFlier(){
        isFrequentFlier = random.nextBoolean();
    }

    private void randomSlowProcess(){
        slowProcess = random.nextBoolean();
    }

    private void randomRequireManager(){
        requireManager = random.nextBoolean();
    }

    private void randomNeedTechSupport(){
        needTechSupport = random.nextBoolean();
    }



    //todo: comment the hell out of project (AND DELETE THESE TODOS!!!!!)

    public boolean getFrequentFlier(){ return isFrequentFlier; }
    public boolean getSlowProcess(){ return slowProcess; }
    public boolean getRequireManager(){ return requireManager; }
    public boolean getNeedTechSupport(){ return needTechSupport; }


    @Override
    public int compareTo(Passenger o) {
        if(o.getFrequentFlier())
            return 1;
        else return -1;
    }
}
