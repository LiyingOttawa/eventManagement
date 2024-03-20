/**
 * File name: MovieNightEvent.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: MovieNightEvent is Event
 */
package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 * This class is an event of public library
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class MovieNightEvent extends Event {

    public MovieNightEvent(int eventId,String eventDescription, String eventActivities, double admissionFees) {
        super(eventId,EventType.MOVIE_NIGHT.name(), eventDescription, eventActivities, admissionFees);
    }

    @Override
    public void calculateAdmissionFee() {
        this.admissionFees = Constants.MOVIE_NIGHT_RATE*Constants.MOVIE_NIGHT_DURATION;
    }
    
}
