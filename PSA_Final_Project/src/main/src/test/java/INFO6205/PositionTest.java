package INFO6205;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PositionTest {
    @Mock
    SetPosition place1;
    @Mock
    AvailablePosition place2;

    @Test
    public void verifyEuclideanDistance(){
        int a =Position.getEucladianDistance(4,6,4,6);
        assertEquals(a,2);
    }

    @Test
    public void PositionNotNull(){
        Position position =new Position(1,2);
        assertNotNull(position);

    }
    @Test
    public void verifyDistancePlace(){

        List<PositionProvider> placesList = new ArrayList<>();
        List<Position> positions1 = new ArrayList<>();
        positions1.add(new Position(1,2));
        List<Position> positions2 = new ArrayList<>();
        positions2.add(new Position(2,3));
        place1 = new SetPosition(positions1);
        place2 = new AvailablePosition(positions2);
        placesList.add(0,place1);
        placesList.add(1,place2);
        assertEquals(Position.getDistancePlace(placesList.get(1), placesList.get(0)),1);

    }


}