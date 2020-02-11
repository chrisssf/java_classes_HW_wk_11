import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void starts_with_no_paper(){
        assertEquals(0, printer.getPaper().intValue());
    }

    @Test
    public void can_add_paper(){
        printer.addPaper(20);
        printer.addPaper(5);
        assertEquals(25, printer.getPaper().intValue());
    }

    @Test
    public void can_print(){
        printer.addPaper(30);
        printer.addTonerVolume(21);
        printer.print(7, 3);
        assertEquals(9, printer.getPaper().intValue());
    }

    @Test
    public void not_enough_paper_to_print(){
        printer.addPaper(10);
        printer.print(7, 3);
        assertEquals(10, printer.getPaper().intValue());
    }

    @Test
    public void not_enough_toner_to_print(){
        printer.addPaper(100);
        printer.addTonerVolume(5);
        printer.print(2, 5);
        assertEquals(5, printer.getTonerVolume().intValue());
    }

    @Test
    public void starts_with_no_toner(){
        assertEquals(0, printer.getTonerVolume().intValue());
    }

    @Test
    public void can_add_toner(){
        printer.addTonerVolume(5);
        printer.addTonerVolume(15);
        assertEquals(20, printer.getTonerVolume().intValue());
    }

    @Test
    public void printing_reduces_toner_volume(){
        printer.addTonerVolume(50);
        printer.addPaper(20);
        printer.print(6, 2);
        assertEquals(38, printer.getTonerVolume().intValue());
    }
}
