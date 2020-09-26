import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KundeTest {
    
    @Test
    public void testId() {
        Kunde nyKunde = new Kunde(0, "Sigmund");
        
        int expected = 0;
        int actual = nyKunde.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testNavn() {
        Kunde nyKunde = new Kunde(0, "Sigmund");

        String expected = "Sigmund";
        String actual = nyKunde.getNavn();
        
        assertEquals(expected, actual);
    }
}
