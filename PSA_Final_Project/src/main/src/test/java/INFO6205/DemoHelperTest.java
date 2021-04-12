package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DemoHelperTest {
    @Mock
    DisplaySpread displaySpread;

    @BeforeEach
    void setUp() {

    }
    @Test
    public void DemoHelperObjectIsNotNull(){
        DemoHelper demoHelper =new DemoHelper(displaySpread);
        assertNotNull(demoHelper);
    }

}