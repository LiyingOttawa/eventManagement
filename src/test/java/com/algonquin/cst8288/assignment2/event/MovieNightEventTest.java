package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.event.factory.EventCreator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glily
 */
public class MovieNightEventTest {
    /**
     * Test of calculateAdmissionFee method, of class MovieNightEvent.
     */
    @Test
    public void testCalculateAdmissionFee() {
        System.out.println("calculateAdmissionFee");
        Event event = EventCreator.build(EventType.MOVIE_NIGHT).makeEvent();
        event.calculateAdmissionFee();
        assertEquals(7.5, event.getAdmissionFees(),0.001);
    }
    
}
