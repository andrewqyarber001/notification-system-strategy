package services;

import app.NotificationMedium;

/**
 * Concrete implementation of NotificationMedium for WhatsApp notifications.
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class WhatsAppService implements NotificationMedium {
    /**
     * Sends a notification message through WhatsApp.
     * @param message The message to be sent as a notification.
     */
    @Override
    public void send(String message) {
        // Simulate sending a WhatsApp notification
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}