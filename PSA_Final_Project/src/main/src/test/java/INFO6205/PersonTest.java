package INFO6205;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    @Mock
    public PositionProvider home;
    @Mock
    public PositionProvider publicPlace;
    @Mock
    Person mockPeople;

    Position position;

    @Test
    public void VerifyAgeisLessThan100(){
       Person people = new Person();
        int a =people.returnAge();
        assertTrue(a<100);


    }
    @Test
    public void verifyPeopleObjectIsNotNull(){
        Person people = new Person();
        assertNotNull(people);

    }
    @Test
    public void testage(){
        Person people = new Person();
        for (int i = 0; i < 80; i++)
            assertEquals(10,people.returnAge(), 80);
    }
    @Test
    public void testageNegative(){
        Person people = new Person();
        for (int i = 0; i < 80; i++)
            assertNotSame(0,people.returnAge());
    }

    @Test
    public void spreadDiseaseTest(){
        Person people = new Person();
        position = new Position(1,2);
        //assertSame(false,people.isFrontLineWorker()) ;
        position.getEucladianDistance(position.x,0,position.y,0);
    }


}