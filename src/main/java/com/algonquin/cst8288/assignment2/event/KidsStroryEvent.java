/**
 * File name: KidsStroryEvent.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: KidsStroryEvent is Event
 */
package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 * This class is an event of public library
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class KidsStroryEvent extends Event {

    public KidsStroryEvent(int eventId,String eventDescription, String eventActivities, double admissionFees) {
        super(eventId,EventType.KIDS_STORY.name(), eventDescription, eventActivities, admissionFees);
    }

    @Override
    public void calculateAdmissionFee() {
        this.admissionFees = Constants.KIDS_STORYTIME_RATE*Constants.KIDS_STORYTIME_DURATION;
    }
    
}
