package services;

import app.NotificationMedium;

/**
 * Concrete implementation of NotificationMedium for sending SMSService
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class SMSService implements NotificationMedium {
    /**
     * Sends a notification message through SMS.
     * @param message The message to be sent as a notification.
     */
    @Override
    public void send(String message) {
        // Simulate sending an SMS notification
        System.out.println("Sending SMS: " + message);
    }
}