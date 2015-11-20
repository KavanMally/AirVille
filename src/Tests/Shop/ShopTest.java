package Tests.Shop;

import Objects.Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kavan on 11/19/15.
 */
public class ShopTest {


    private Shop shop;


    @Before
    public void init(){

        shop = Shop.getShop();
    }

    @Test
    public void test(){

        shop.buyDiamonds();
        shop.buyWithDiamonds();

        assertEquals(true, true);
    }

}
