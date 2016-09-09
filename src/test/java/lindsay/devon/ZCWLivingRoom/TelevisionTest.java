package lindsay.devon.ZCWLivingRoom;

/**
 * Created by devonlindsay on 9/9/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TelevisionTest {

@Test
    public void getVolumeTest() {
    Television television = new Television();
        int expectedVolume = 0;
        int actualVolume = television.getVolume();

        assertEquals("The value should be 0", expectedVolume, actualVolume);

    }
@Test
    public void setVolumeTest() {
        Television television = new Television();
        television.setVolume(7);
        int actualAmount = television.getVolume();
        int expectedAmount = 7;
        assertEquals("The value should be 0", expectedAmount, actualAmount);


    }


}
