import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiTest {

    @Test
    void costOfTrip() {
        Taxi taxi = new Taxi();
        int costOfTrip = taxi.costOfTrip(50);
        assertEquals(1007,costOfTrip);
    }
}