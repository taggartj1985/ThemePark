package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor oldButSmallVisitor;
    Visitor youngButTallVisitor;
    Visitor vistorCanRideRoller;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        oldButSmallVisitor = new Visitor(100, 12, 10);
        youngButTallVisitor = new Visitor(12, 10000, 1000);
        vistorCanRideRoller = new Visitor(13, 146, 190);
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
    public void isAllowedToride(){assertEquals(true, rollerCoaster.isAllowedTo(vistorCanRideRoller));
    }

    @Test
    public void isNotAllowedTorideDueToHeight(){assertEquals(false, rollerCoaster.isAllowedTo(oldButSmallVisitor));
    }

    @Test
    public void isAllowedTorideDueToAge(){assertEquals(false, rollerCoaster.isAllowedTo(youngButTallVisitor));
    }
}
