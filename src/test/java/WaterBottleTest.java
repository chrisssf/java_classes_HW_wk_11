import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void volume_starts_at_100(){
        assertEquals(100, waterBottle.getVolume().intValue());
    }

    @Test
    public void can_drink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume().intValue());
    }

    @Test
    public void can_empty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume().intValue());
    }

    @Test
    public void can_fill(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume().intValue());
    }
}
