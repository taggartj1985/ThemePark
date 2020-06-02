package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        youngVisitor = new Visitor(11, 100, 10);
        oldVisitor = new Visitor(20, 100, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetRollerCoasterPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void normalTicketForGuests(){
        assertEquals(4.50, dodgems.priceFor(oldVisitor), 0.01);
    }

    @Test
    public void cheapTicketForGuests(){
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
    }
}

