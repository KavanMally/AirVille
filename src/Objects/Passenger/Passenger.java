package Objects.Passenger;

import Objects.Lines.Line;

import java.util.Random;

/**
 * Created by kavan on 11/15/15.
 */
public class Passenger implements Comparable<Passenger> {

    private boolean isFrequentFlier; //indicates whether passenger has priority in InPersonLine
    private boolean slowProcess; //indicates whether passenger requires more time processing
    private boolean requireManager; //indicates whether passenger requires supervisor to be processed
    private boolean needTechSupport; //indicates whether passenger requires TerminalAgent in TerminalLine
    private boolean requireHuman;

    private Random random; //random number generator used to generate booleans

    private final static int MODIFIER = 2; //modifies timeOfProcess



    public Passenger(){

        random = new Random();
        randomIsFrequentFlier();
        randomSlowProcess();
        randomRequireManager();
        randomNeedTechSupport();
        randomRequireHuman();
    }

    //more for testing purposes
    public Passenger(boolean isFrequentFlier){

        random = new Random();
        this.isFrequentFlier = isFrequentFlier;
        randomSlowProcess();
        randomRequireManager();
        randomNeedTechSupport();
        randomRequireHuman();

    }

    public Passenger(boolean isFrequentFlier, boolean slowProcess, boolean requireManager, boolean needTechSupport, boolean requireHuman){
        this.isFrequentFlier = isFrequentFlier;
        this.slowProcess = slowProcess;
        this.requireManager = requireManager;
        this.needTechSupport = needTechSupport;
        this.requireHuman = requireHuman;
    }






    /**
     * How passenger enters line
     * @param line
     */
    public void enterLine(Line line){
        line.addPassenger(this);
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

    private void randomRequireHuman(){
        requireHuman = random.nextBoolean();
    }




    public boolean getFrequentFlier(){ return isFrequentFlier; }
    public boolean getSlowProcess(){ return slowProcess; }
    public boolean getRequireManager(){ return requireManager; }
    public boolean getNeedTechSupport(){ return needTechSupport; }
    public boolean getRequireHuman(){ return requireHuman; }

    public int getMODIFIER(){ return MODIFIER; }


    /**
     * If passenger isFrequentFlier, has priority in queue, else normal FIFO
     * @param o
     * @return
     */
    @Override
    public int compareTo(Passenger o) {

        if(aGreaterThanBTest(o) )
            return 1;
        else if(aLessThanBTest(o))
            return -1;
        else return 0; //equal case
    }

    private boolean aGreaterThanBTest(Passenger o){
        return this.getFrequentFlier() && !o.getFrequentFlier();
    }

    private boolean aLessThanBTest(Passenger o){
        return !this.getFrequentFlier() && o.getFrequentFlier();
    }




}
