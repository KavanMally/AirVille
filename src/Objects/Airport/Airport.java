package Objects.Airport;

/**
 * Created by kavan on 12/1/15.
 */
public class Airport {

    //todo: remove unused imports
    private long diamonds;
    private long points;


    public static Airport airport = null;

    /**
     * Private constructor prevents instantiation outside class
     */
    private Airport(){
        diamonds = 0;
        points = 0;
    }


    public static Airport getAirport(){
        if(airport == null)
            airport = new Airport();
        return airport;
    }

    /**
     * Increases player's points value
     * Default method increases by 1
     */
    public void incrementPoints(){
        points++;
    }

    /**
     * Increases player's poinnt value
     * @param increment Value by which to increase points
     */
    public void incrementPoints(long increment){
        points += increment;
    }

    public void increaseDiamonds(){
        diamonds++;
    }

    public void increaseDiamonds(long increment){
        diamonds += increment;
    }

    public void decreaseDiamonds(long increment){

        //check if operation would drop diamonds to negative zone, if so undo operation
        if( (diamonds -= increment) < 0){
            diamonds += increment;
            System.out.println("Error: insufficient funds");
        }
    }
}
