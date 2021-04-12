package INFO6205;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PositionTest {
    @Mock
    SetPosition place1;
    @Mock
    AvailablePosition place2;

    @Test
    public void verifyGetEucladianDistanceIsRetruningExpected(){
        int a =Position.getEucladianDistance(4,6,4,6);
        assertEquals(a,2);
    }

    @Test
    public void verifyPositionIsNotNull(){
        Position position =new Position(1,2);
        assertNotNull(position);

    }


}