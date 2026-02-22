Flexible Notification System (Maintenance & Evolution)


Author: Andrew Q. Yarber 


Date: February 2026 

📝 Project Purpose
This project implements a modular notification system designed for high maintainability. It provides a framework for sending alerts across multiple communication channels—Email, SMS, and WhatsApp—while ensuring the core logic remains protected from modification during feature expansion.

Quick Start (CLI Execution)
This program is designed for professional execution via the Command Line Interface (CLI). Following these steps ensures the environment is configured correctly for a seamless handover.

1. Dependency Management & Setup
This project uses Maven to standardize the environment. A developer can initialize the project with a single command:

Bash

mvn install


2. Compilation
To manually compile the source files into the bin directory (as specified in the .gitignore), run:

Bash

javac -d bin *.java


3. Execution

Run the application using the main operation class:

Bash

java -cp bin Main


4. Testing Suite (Build Health Verification)

To verify the integrity of the Strategy Design Pattern and ensure the history ArrayList is logging correctly:

Test Directory: src/test/java/

Command:

Bash 

java -cp bin test.TestWhatsApp


This confirms the build's health by validating that new services (WhatsApp) can be injected without modifying the core AlertSystem logic.

🏗 Architectural Overview
The system is built using professional standards to ensure a seamless handover to other developers:


Strategy Design Pattern: The system defines a NotificationMedium interface as a strict contract for all delivery services.


Composition over Inheritance: By using composition, the system allows for dynamic swapping of notification methods at runtime via setMedium() without altering core logic.


Encapsulation: The AlertSystem class acts as a context container, holding a reference to a NotificationMedium object while managing a session log.


Session Logging: The system utilizes a java.util.ArrayList<String> to track every message sent during the current session for history retrieval.

🛠 Maintenance: Adding New Services
The system is designed for evolution rather than rewriting. To add a new service (e.g., Slack or Push Notifications):



Create a new class in the services package.


Implement the NotificationMedium interface.


Inject the new class into AlertSystem.setMedium().


Note: No changes to the AlertSystem core logic are required.

📚 API Documentation (JavaDocs)
This project uses the Maven Javadoc Plugin to standardize technical documentation. Inline JavaDocs are present for all public methods and classes.

To generate the full HTML technical manual in the target/site/apidocs folder, run the following command from the root directory:

Bash

mvn javadoc:javadoc



⚖️ Licensing
This project is provided for academic purposes under the standards of CSC6301 Module 5.