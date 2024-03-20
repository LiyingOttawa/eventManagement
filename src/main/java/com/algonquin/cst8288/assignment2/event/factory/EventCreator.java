package com.algonquin.cst8288.assignment2.event.factory;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;

/**
 *
 * @author Glily
 */
public abstract class EventCreator {
    public static EventCreator build(EventType type){
        switch(type)
        {
            case KIDS_STORY:
                return KidsStroryEventCreator.build();
            case MOVIE_NIGHT:
                return MovieNightEventCreator.build();
            case WORKSHOP:
                return WorkshopEventCreator.build();
        }
        
        return KidsStroryEventCreator.build();
    }
    protected int eventId;
    protected String eventName;
    protected String eventDescription;
    protected String eventActivities;
    protected double admissionFees;
    
    public EventCreator eventName(String eventName)
    {
        this.eventName=eventName;
        return this;
    }
    public EventCreator eventDescription(String eventDescription){
        this.eventDescription = eventDescription;
        return this;
    }
    public EventCreator eventActivities(String eventActivities)
    {
        this.eventActivities = eventActivities;
        return this;
    }
    public EventCreator admissionFees(double admissionFees)
    {
        this.admissionFees = admissionFees;
        return this;
    }
    public EventCreator eventId(int eventId)
    {
        this.eventId = eventId;
        return this;
    }
    public abstract Event makeEvent();
}
