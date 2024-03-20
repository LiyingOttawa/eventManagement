package com.algonquin.cst8288.assignment2.client;

import com.algonquin.cst8288.assignment2.database.DBOperations;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;
import com.algonquin.cst8288.assignment2.event.factory.EventCreator;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import java.sql.SQLException;


/***
 * This is the entry point for the application
 * The application should connect with a database named 
 * bookvault and support fundamental CRUD (Create, Read, Update, Delete) operations on events
 * table within the database.
 * @param args Command line arguments are not used by this program.
 */
public class Client {
	
	public static void main(String[] args) {
            Event kidsStoryEvent1 = EventCreator.build(EventType.KIDS_STORY).eventDescription("kidsStoryEvent1").eventActivities("kidsStoryActivities1").makeEvent();
            kidsStoryEvent1.calculateAdmissionFee();
            
            Event movieNightEvent1 = EventCreator.build(EventType.MOVIE_NIGHT).eventDescription("movieNightEvent1").eventActivities("movieNightActivities1").makeEvent();
            movieNightEvent1.calculateAdmissionFee();
            
            Event workshopEvent1 = EventCreator.build(EventType.WORKSHOP).eventDescription("workshopEvent1").eventActivities("workshopActivities1").makeEvent();
            workshopEvent1.calculateAdmissionFee();
            try {
                DBOperations.deleteAllRecords();
                DBOperations.createEvent(kidsStoryEvent1);
                DBOperations.createEvent(movieNightEvent1);
                DBOperations.createEvent(workshopEvent1);
            } catch (SQLException ex) {
                LMSLogger.getInstance().log("DBOperations Error:", ex);
            }
	}
}
