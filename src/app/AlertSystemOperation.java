package app;

import services.EmailService;
import services.SMSService;
import services.WhatsAppService;


/**
 * Main class to demonstrate the use of NotificationMedium interface and its implementations.
 * @version 1.0
 * @author Andrew Q. Yarber
 */

public class AlertSystemOperation {

    /**
     * The main method to demonstrate the functionality of the AlertSystem with different notification mediums (EmailService and SMSService).
     * @param args Command-line arguments (not used in this demonstration).
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();

        // Set the notification medium to EmailService and send a notification
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("This is an email notification.");

        // Set the notification medium to SMSService and send a notification
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("This is an SMS notification.");

        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("This is a WhatsApp notification.");


        // Demonstrate retrieving from the collection
        System.out.println("\n--- Notification History ---");
        for (String log : alertSystem.getHistory()) {
            System.out.println("Logged: " + log);
}
    }   
}

//Week 5 Update
// Gemini 3.0 was used to generate the WhatsAppService class, 
// which implements the NotificationMedium interface. 
// The send method was implemented to simulate sending a WhatsApp notification by 
// printing a message to the console. The AlertSystemOperation class was updated to 
// include an instance of WhatsAppService and demonstrate sending a WhatsApp 
// notification, as well as retrieving and displaying the notification history.

// Gemini was asked to "generate the WhatsAppService class and a test script" given 
// the existing AlertSystem, EmailService, and AlertSystemOperation classes. 

// To verify AI output matched the existing interface signature perfectly I verified that
// public void send(String message) exactly matched the NotificationMedium.java file.

// @author and @version tags were added to new WhatsAppService file to to match the style of AlertSystem.java and EmailService.java
// @param tags added to describe the message string, ensuring it is compatible with the javadoc