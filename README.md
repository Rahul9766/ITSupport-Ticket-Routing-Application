# Intelligent IT Support Ticket Routing System 🚀

## Project Overview 📋
- **Automated Ticket Routing:** Automatically classify and route IT support tickets to the appropriate team.
- **AI-Powered Simulation:** Uses a mock AI API to analyze the ticket description and decide the assigned team and priority.
- **Efficient IT Support:** Streamlines the ticket triage process to reduce response times and minimize human errors.
- **Spring Boot & H2:** Built using Spring Boot with an in-memory H2 database for rapid development and testing.

## Key Features 🔑
- **Automated Routing:** Routes tickets based on context analysis without manual intervention.
- **Priority Determination:** Assigns a priority (High, Medium, Low) by detecting keywords in the ticket description.
- **Multiple Support Teams:** Supports various teams like Network, Software, Hardware, Security, Cloud, Database, and Infrastructure.
- **RESTful API:** Exposes a simple API endpoint for raising and managing tickets.
- **Extensibility:** Easily adaptable to integrate with a real AI service in the future.

## Technology Stack 💻
- **Spring Boot:** For building the RESTful service.
- **Spring Data JPA:** For ORM and database interactions.
- **H2 Database:** In-memory database for development and testing.
- **Java 11+ (or later):** Core programming language.
- **Maven/Gradle:** For dependency management and build automation.

## How It Works ⚙️
1. **Ticket Submission:** A user submits a ticket with a description via a POST request.
2. **Ticket Creation:** The system saves the ticket with a default status of `NEW`.
3. **AI Simulation:** A mock AI client analyzes the description to decide:
   - **Assigned Team:** e.g., Network, Software, Hardware, etc.
   - **Priority:** e.g., High, Medium, or Low.
4. **Ticket Update:** The ticket is updated with the assigned team, determined priority, and status set to `ASSIGNED`.
5. **Response:** The updated ticket details are returned in a JSON response, along with a success message.

## Challenges Faced 😓
- **Complex Context Analysis:** Interpreting free-form text to reliably determine routing requires careful keyword mapping.
- **Overlapping Keywords:** Managing conflicting keywords for multiple teams (e.g., "server" vs. "database") required prioritization.
- **Scalability:** Ensuring the system design allows for future integration with a real AI service without major refactoring.

## Problems Resolved & Benefits 🎯
- **Eliminates Manual Errors:** Automation reduces mistakes in assigning tickets to the wrong team.
- **Faster Response Times:** Quick routing leads to faster issue resolution.
- **Optimized Resource Allocation:** Ensures that specialized teams handle relevant issues, improving overall support efficiency.
- **Scalable & Future-Proof:** Lays the groundwork for advanced AI integration as support needs evolve.
- **Enhanced User Experience:** Improved ticket handling and resolution lead to higher satisfaction levels among users.

![Test Output Screenshot](https://github.com/Rahul9766/ITSupport-Ticket-Routing-Application/blob/9f778f44687da43af0a5a3463cf0030018b177bb/test_output/Screenshot%202025-02-25%20132622.png)
