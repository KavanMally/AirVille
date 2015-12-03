package Objects.Shop;

/**
 * Created by kavan on 11/15/15.
 */
public class Shop {


    private static Shop shop = null;


    private static final int COST_OF_SUPERVISOR = 10;
    private static final int COST_OF_INPERSONLINE = 5;
    private static final int COST_OF_TERMINALINE = 2;


    private Shop(){}

    public static Shop getShop(){
        if(shop == null)
            shop = new Shop();
        return shop;
    }


    public void buyDiamonds(){
        System.out.println("Coming soon!");
    }

    public void buyWithDiamonds(){
        System.out.println("Coming soon!");
    }


    public int getCostOfSupervisor(){ return COST_OF_SUPERVISOR; }

    public int getCostOfInpersonline(){ return COST_OF_INPERSONLINE; }

    public int getCostOfTerminaline(){ return COST_OF_TERMINALINE; }

}