package Objects.Supervisor;

import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor  {



    private int MAX_NUMBER_OF_SUPERVISORS = 1;
    private boolean inLine;
    private int MODIFIER;



    public Supervisor(){
        MODIFIER = 2; //default value
    }

    public Supervisor(int modifier){
        MODIFIER = modifier;
    }

    public void moveSupervisor(Line line){
        line.acceptSupervisor(this);
    }


    public void sideLine(){
        inLine = false;
    }


    public void setInLine(boolean inLine){ this.inLine = inLine;}

    public boolean getInLine(){ return inLine;}

    public int getMODIFIER(){ return MODIFIER; }
}
