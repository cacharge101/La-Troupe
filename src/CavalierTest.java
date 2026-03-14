import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CavalierTest {

    @Test
    public void testPasDeCharge() {
        Cavalier c = new Cavalier("Arthur", 80, 0);
        assertEquals(15, c.vitesseMaximale());
    }

    @Test
    public void testChargeMoinsDe50() {
        Cavalier c = new Cavalier("Arthur", 80, 30);
        assertEquals(13, c.vitesseMaximale());
    }

    @Test
    public void testChargeEntre50et100() {
        Cavalier c = new Cavalier("Arthur", 80, 70);
        assertEquals(10, c.vitesseMaximale());
    }

    @Test
    public void testChargePlusDe100() {
        Cavalier c = new Cavalier("Arthur", 80, 120);
        assertEquals(8, c.vitesseMaximale());
    }

}