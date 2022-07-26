package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(15, 145.00, 20.00);
        visitor2 = new Visitor(16, 175.00, 20.00);
        visitor3 = new Visitor(20, 205.00,20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void getPriceForTallPerson(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.00);
    }

    @Test
    public void getPriceForSmallPerson(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.00);
    }

    @Test
    public void canRideRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cantRideRollerCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
