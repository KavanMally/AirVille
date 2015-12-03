package Objects.Shop;

/**
 * Created by kavan on 11/15/15.
 */
public class Shop {


    private static Shop shop = null;

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
}