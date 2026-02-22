package app;

/**
 * Interface for a notification medium, which can be implemented by various classes to send notifications through different channels (e.g., email, SMS, push notifications).
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public interface NotificationMedium {
    /**
     * Sends a notification message through the implemented medium.
     * @param message The message to be sent as a notification.
     */
    void send(String message);
}


