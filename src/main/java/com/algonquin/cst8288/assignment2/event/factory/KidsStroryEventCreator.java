/**
 * File name: KidsStroryEventCreator.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: KidsStroryEventCreator is EventCreator
 */
package com.algonquin.cst8288.assignment2.event.factory;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.KidsStroryEvent;

/**
 * This class is a factory class to create a kids story Event
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class KidsStroryEventCreator extends EventCreator {
    public static EventCreator build(){
        return new KidsStroryEventCreator();
    }
    @Override
    public Event makeEvent() {
        return new KidsStroryEvent(this.eventId,this.eventDescription,this.eventActivities,this.admissionFees);
    }
    
}
