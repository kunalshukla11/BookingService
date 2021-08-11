import com.booking.price.PriceCalculatorImpl;
import model.Facilities;
import org.junit.BeforeClass;
import org.junit.Test;
import rooms.SuiteRoom;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class EnsuiteRoomTest {

    static PriceCalculatorImpl priceCalculator;


    @BeforeClass
    public static void intialize(){

        priceCalculator= new PriceCalculatorImpl();

    }


    @Test
    public  void testSuiteRoomWithBrekfastAndBathroom(){

        SuiteRoom suiteRoom=new SuiteRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST));
        suiteRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(suiteRoom)).isEqualTo(9);

    }

    @Test
    public  void testGreatRoomWithBreakfastAndBathroomAndInternet(){

        SuiteRoom suiteRoom=new SuiteRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST,Facilities.INTERNET));
        suiteRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(suiteRoom)).isEqualTo(11);

    }


}
