import com.booking.price.PriceCalculatorImpl;
import model.Facilities;
import org.junit.BeforeClass;
import org.junit.Test;
import rooms.GreatViewRoom;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatViewRoomTest {

    static PriceCalculatorImpl priceCalculator;


    @BeforeClass
    public static void intialize(){

        priceCalculator= new PriceCalculatorImpl();

    }


    @Test
    public  void testGreatRoomWithBrekfastAndBathroom(){

        GreatViewRoom greatViewRoom=new GreatViewRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST));
        greatViewRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(greatViewRoom)).isEqualTo(18);

    }

    @Test
    public  void testGreatRoomWithBreakfastAndBathroomAndInternet(){

        GreatViewRoom greatViewRoom=new GreatViewRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST,Facilities.INTERNET));
        greatViewRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(greatViewRoom)).isEqualTo(22);

    }


}
