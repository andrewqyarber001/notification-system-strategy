package app;


import java.util.List;
import java.util.ArrayList;

/**
 * Class representing an alert system that can send notifications to users through a specified medium.
 * The alert system uses the NotificationsMedium interface to send messages, allowing for flexibility in the choice
 * of notification channels.
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class AlertSystem {
    private NotificationMedium medium;
    private List<String> history = new ArrayList<>();
    /**
     * Sets the notification medium for this alert system.
     * @param medium The notification medium to be used for sending notifications.
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }
    /**
     * Sends a notification and stores it in the history log.
     * @param message The message to be sent and logged.
     */
    public void notifyUser(String message) {
        if (medium != null) {
            medium.send(message);
            // Adding the message to the ArrayList history
            history.add(message);
        } else {
            System.out.println("No notification medium set.");
        }
    }
    /**
     * Retrieves the history of sent notifications.
     * @return A list of messages that have been sent as notifications.
     */
    public List<String> getHistory() {
        return new ArrayList<>(history); // Return a copy of the history to prevent external modification
    }
}
