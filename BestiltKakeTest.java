import org.junit.Test;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;


public class BestiltKakeTest {
    
    @Test 
    public void testKunde() {
        Kunde nyKunde = new Kunde(0, "Sigmund");
        BestiltKake nyBestiltKake = new BestiltKake(nyKunde, "Sjokoladekake", LocalDateTime.now());

        Kunde actual = nyKunde;
        Kunde expected = nyBestiltKake.getKunde();

        assertEquals(expected, actual);
    }
}
