
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatriceTest {
    Calculatrice calcul = new Calculatrice();

    @Test
    public void testSom() {
    assertEquals(25, calcul.Somme(10, 15));
   
    }
    @Test
    public void testdivision() {
    assertEquals(5, calcul.division(40, 0));
    }

}
