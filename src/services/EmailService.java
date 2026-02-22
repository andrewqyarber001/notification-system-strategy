package services;

import app.NotificationMedium;

/**
 * Concrete implementation of NotificationMedium for email notifications.
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class EmailService implements NotificationMedium {
    /**
     * Sends a notification message through email.
     * @param message The message to be sent as a notification.
     */
    @Override
    public void send(String message) {
        // Simulate sending an email notification
        System.out.println("Sending email: " + message);
    }
}