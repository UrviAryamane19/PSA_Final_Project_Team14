package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DisplacementTest {

    @Mock
    Person people;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void movementObjectisNotnull(){
        Displacement movement =new Displacement(people,5);
        assertNotNull(movement);
        System.out.println(movement.stay);
        System.out.println(movement.makeStay());
    }

    @Test
    public void verifyIfStayisNotFinished(){
        Displacement movement =new Displacement(people,5);
        assertEquals(movement.makeStay(),false);

    }


    @Test
    public void verifyIfStayisFinished(){
        Displacement movement =new Displacement(people,-1);
        assertEquals(movement.makeStay(),true);

    }



}