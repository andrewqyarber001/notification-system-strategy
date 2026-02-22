Flexible Notification System (Maintenance & Evolution)

Author: Andrew Q. Yarber 


Date: February 2026 

Project Purpose
This project implements a modular notification system designed for high maintainability. It provides a framework for sending alerts across multiple communication channels—Email, SMS, and WhatsApp—while ensuring the core logic remains protected from modification during feature expansion.


Quick Start (CLI Execution)
This program is designed to be compiled and run strictly via the Command Line Interface (CLI).

Compilation:
Navigate to the project root and run: 

Bash
javac -d bin src/app/*.java src/services/*.java
Execution:
Run the application using the main operation class: 

Bash
java -cp bin app.AlertSystemOperation
Run Unit Tests:
Verify the WhatsApp integration and maintenance task: 

Bash
java -cp bin app.TestWhatsApp
🏗 Architectural Overview
The system is built using professional standards to ensure it can be easily handed over to another developer:


Strategy Design Pattern: The system defines a NotificationMedium interface as a contract for all delivery services.

Composition over Inheritance: By using composition, the system allows for dynamic swapping of notification methods at runtime via setMedium() without altering core logic.


Encapsulation: The AlertSystem class acts as a context container, holding a reference to a NotificationMedium object while managing a session log.


Session Logging: The system utilizes a java.util.ArrayList<String> to track every message sent during the current session for history retrieval.

Maintenance: Adding New Services
The system is designed for evolution rather than rewriting. To add a new service:

Create a new class in the services scope.

Implement the NotificationMedium interface.

Pass the new class into AlertSystem.setMedium().


Note: No changes to the AlertSystem core logic are required.

Documentation & Standards

JavaDocs: All files include professional-grade JavaDocs with @param, @author, and @version tags.


Generate Documentation: To generate the professional HTML manual in a dedicated folder, run: 

Bash
javadoc -d docfolder -sourcepath src -subpackages app:services
Licensing

This project is provided for academic purposes under the standards of CSC6301 Module 5.