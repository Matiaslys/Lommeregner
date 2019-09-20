import junit.framework.TestCase;

public class LommeregnerTest extends TestCase {

    public void testSum() {

        Lommeregner lommeregner  = new Lommeregner();
        int x = 12;
        int y = 5;
        int result = lommeregner.sum(x, y);

        assertEquals(17, result);

    }

    public void testMinus() {
        Lommeregner lommeregner  = new Lommeregner();
        int x = 12;
        int y = 5;
        int result = lommeregner.minus(x, y);

        assertEquals(7, result);
    }

    public void testMultiplicere() {
        Lommeregner lommeregner  = new Lommeregner();
        int x = 12;
        int y = 5;
        int result = lommeregner.multiplicere(x, y);

        assertEquals(60, result);
    }

    public void testDele() {
        Lommeregner lommeregner  = new Lommeregner();
        int x = 12;
        int y = 5;
        int result = lommeregner.dele(x, y);

        assertEquals(2, result);
    }

    public void testSecret() {
        Lommeregner lommeregner  = new Lommeregner();
        int x = 12;
        int y = 5;
        int result = lommeregner.secret(x, y);

        assertEquals(12, result);
    }
}