package INFO6205;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    @Mock
    public PositionProvider home;
    @Mock
    public PositionProvider publicPlace;
    @Mock
    Person mockPeople;

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

}