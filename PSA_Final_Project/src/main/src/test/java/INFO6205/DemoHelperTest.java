package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DemoHelperTest {

    DisplaySpread displaySpread;
    DisplaySpreadHelper displaySpreadHelper;
    public static int frequencySimulator =50;

    @BeforeEach
    void setUp() {

    }
    @Test
    public void DemoHelperObjectNotNull(){
        DemoHelper demoHelper =new DemoHelper(displaySpread);
        assertNotNull(demoHelper);
    }
    @Test
    public void testRun(){
        DemoHelper demoHelper =new DemoHelper(displaySpread);
        displaySpreadHelper = new DisplaySpreadHelper();
        displaySpread = new DisplaySpread();


        demoHelper.run();

        displaySpread.repaint();
        displaySpreadHelper.spreadInfection(DisplaySpreadHelper.place1);
        assertEquals(frequencySimulator % 100 == 0,false);
    }

}