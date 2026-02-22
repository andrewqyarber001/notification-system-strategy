package app;

import services.WhatsAppService;


/**
 * Test script to verify the WhatsAppService integration with AlertSystem.
 */
public class TestWhatsApp {
    public static void main(String[] args) {
        // Initialize the alert system
        AlertSystem alertSystem = new AlertSystem();

        // 1. Set medium to WhatsApp
        System.out.println("--- Testing WhatsApp Service ---");
        alertSystem.setMedium(new WhatsAppService());

        // 2. Send test notifications
        alertSystem.notifyUser("Hey! This is a test WhatsApp alert.");
        alertSystem.notifyUser("Don't forget the meeting at 3 PM.");

        // 3. Verify history retrieval
        System.out.println("\n--- History Verification ---");
        int count = 1;
        for (String log : alertSystem.getHistory()) {
            System.out.println("Log #" + count + ": " + log);
            count++;
        }
    }
}