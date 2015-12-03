package Objects.Supervisor;

import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor  {



    private boolean inLine;
    private final int MODIFIER;

    private Line line;


    public Supervisor(){
        MODIFIER = 2; //default value
    }

    public Supervisor(int modifier){
        MODIFIER = modifier;
    }

    /**
     * Moves supervisor from current line to new line
     * Handles case where supervisor has not been set to line yet
     * Also handles dereferencing from old line
     * @param line
     */
    public void moveSupervisor(Line line){
        if(null != this.line)
            line.removeSupervisor();
        line.acceptSupervisor(this);
        this.line = line;
    }


    /**
     * Removes supervisor from any line
     * Handles case where supervisor is not in any line
     */
    public void sideLine(){

        if(null != line)
            line.removeSupervisor();

        inLine = false;
    }

    public boolean getInLine(){ return inLine;}

    public int getMODIFIER(){ return MODIFIER; }
}
