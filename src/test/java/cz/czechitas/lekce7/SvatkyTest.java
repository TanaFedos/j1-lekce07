package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

class SvatkyTest {

    @Test
    void kdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
        assertNull(svatky.kdyMaSvatek("Eva"));
    }

    @Test
    void jeVSeznamu() {
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Nataša"));
        assertFalse(svatky.jeVSeznamu("Eva"));
        assertFalse(svatky.jeVSeznamu("Tanjksdhvkfdg"));
    }

    @Test
    void getPocetJmen() {
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getPocetJmen());
    }

    @Test
    void getSeznamJmen() {
        Svatky svatky = new Svatky();
        assertNotNull(svatky.getSeznamJmen());
        assertEquals(37, svatky.getSeznamJmen().size());
    }

    @Test
    void pridatSvatekDenMesicInt() {
        Svatky svatky = new Svatky();
        svatky.pridatSvatek("Tatiana", 13, 5);
        assertEquals(MonthDay.of(5, 13), svatky.kdyMaSvatek("Tatiana"));
    }

    @Test
    void pridatSvatekDenMesicMonth() {
        Svatky svatky = new Svatky();
        svatky.pridatSvatek("Valerie", 12, Month.MAY);
        assertEquals(MonthDay.of(Month.MAY, 12), svatky.kdyMaSvatek("Valerie"));
    }

    @Test
    void prridatSvatekMonthDay() {
        Svatky svatky = new Svatky();
        svatky.pridatSvatek("Viktorie", MonthDay.of(5, 22));
        assertEquals(MonthDay.of(5, 22), svatky.kdyMaSvatek("Viktorie"));
    }

    @Test
    void smazatSvatek() {
        Svatky svatky = new Svatky();
        svatky.smazatSvatek("Radoslav");
        assertEquals(36, svatky.getPocetJmen());
    }
}
