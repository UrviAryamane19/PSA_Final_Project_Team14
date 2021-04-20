package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AvailablePositionTest {
    @Mock
    Position position;
    List<Position> positions = new ArrayList<>();

    @BeforeEach
    void setUp() {

        positions.add(position);
    }

    @Test
    public void CreatePlace(){
        PositionProvider place =new SetPosition(positions);
        assertNotNull(place);
    }
}