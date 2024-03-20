/**
 * File name: WorkshopEvent.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: WorkshopEvent is Event
 */
package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 * This class is an event of academic library
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class WorkshopEvent extends Event {

    public WorkshopEvent(int eventId,String eventDescription, String eventActivities, double admissionFees) {
        super(eventId,EventType.WORKSHOP.name() ,eventDescription, eventActivities, admissionFees);
    }

    @Override
    public void calculateAdmissionFee() {
        this.admissionFees = Constants.WORKSHOP_RATE*Constants.WORKSHOP_DURATION;
    }
    
}
