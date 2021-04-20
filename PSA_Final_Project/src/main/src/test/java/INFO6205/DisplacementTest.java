package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DisplacementTest {


    Person people;

    Position position;
    DisplaySpreadHelper displaySpreadHelper;


    @BeforeEach
    void setUp() {
        people = new Person();
        position = new Position(1,2);
        people.x = 2;
        people.y = 1;
        displaySpreadHelper = new DisplaySpreadHelper();
    }

    @Test
    public void movementObjectNotnull(){
        Displacement movement =new Displacement(people,5);
        assertNotNull(movement);
        System.out.println(movement.stay);
        System.out.println(movement.makeStay());
    }

    @Test
    public void StayNotFinished(){
        Displacement movement =new Displacement(people,5);
        assertEquals(movement.makeStay(),false);

    }


    @Test
    public void verifyIfStayisFinished(){
        Displacement movement =new Displacement(people,-1);
        assertEquals(movement.makeStay(),true);

    }
    @Test
    public void directionTest(){
        int[] direction = {3,2};
        Displacement movement =new Displacement(people, position);
        assertEquals(displaySpreadHelper.matrix[people.x][people.y].people.remove(people),false);
        assertEquals(movement.walk(),true);
    }




}