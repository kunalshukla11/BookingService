

import com.booking.price.PriceCalculatorImpl;
import model.Facilities;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import rooms.StandardRoom;

import static org.assertj.core.api.Assertions.assertThat;;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class StandardRoomTest
{

    static PriceCalculatorImpl priceCalculator;


    @BeforeClass
    public static void intialize(){

        priceCalculator= new PriceCalculatorImpl();


    }


    @Test
    public  void testStandardRoomPriceWith3Facilities(){

        StandardRoom stadardRoom=new StandardRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.INTERNET,Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST));
        stadardRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(stadardRoom)).isEqualTo(9);

    }

    @Test
    public  void testStandardRoomPriceWith_4_Facilities(){

        StandardRoom stadardRoom=new StandardRoom();
        ArrayList<Facilities> facilities= new ArrayList<>(Arrays.asList(Facilities.INTERNET,Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST,Facilities.SWIMMING_POOL));
        stadardRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(stadardRoom)).isEqualTo(15);

    }

    @Test
    public  void testStandardRoomPriceWith_5_Facilities(){

        StandardRoom stadardRoom=new StandardRoom();
        ArrayList<Facilities> facilities= new ArrayList<>
                (Arrays.asList(Facilities.INTERNET,Facilities.ENSUITE_BATHROOM,Facilities.ROOM_BREAKFAST,Facilities.SWIMMING_POOL,Facilities.LATE_CHECKOUT));
        stadardRoom.setFacilities(facilities);
        assertThat(priceCalculator.getPrice(stadardRoom)).isEqualTo(21);

    }

}
