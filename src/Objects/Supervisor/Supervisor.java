package Objects.Supervisor;

import Objects.Agents.Agent;
import Objects.Lines.Line;

/**
 * Created by kavan on 11/15/15.
 */
public class Supervisor  {



    private boolean isBusy;
    private final int MODIFIER;

    private Agent pairedTo;


    public Supervisor(){
        MODIFIER = 2; //default value
    }

    public Supervisor(int modifier){
        MODIFIER = modifier;
    }


    public boolean getBusy(){ return isBusy;}
    public void setBusy(boolean isBusy){ this.isBusy = isBusy; }

    public int getMODIFIER(){ return MODIFIER; }
}
