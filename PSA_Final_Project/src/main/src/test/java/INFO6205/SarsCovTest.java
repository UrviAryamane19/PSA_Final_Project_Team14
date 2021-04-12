package INFO6205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SarsCovTest {

    @Test
    public void verifySarsObjectisNotNull(){
        SarsCov sars = new SarsCov();
        assertNotNull(sars);
    }

}