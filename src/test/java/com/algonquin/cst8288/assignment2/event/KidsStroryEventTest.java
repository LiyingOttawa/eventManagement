package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.event.factory.EventCreator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glily
 */
public class KidsStroryEventTest {

    /**
     * Test of calculateAdmissionFee method, of class KidsStroryEvent.
     */
    @Test
    public void testCalculateAdmissionFee() {
        System.out.println("calculateAdmissionFee");
        Event event = EventCreator.build(EventType.KIDS_STORY).makeEvent();
        event.calculateAdmissionFee();
        assertEquals(3.0, event.getAdmissionFees(),0.001);
    }
    
}
