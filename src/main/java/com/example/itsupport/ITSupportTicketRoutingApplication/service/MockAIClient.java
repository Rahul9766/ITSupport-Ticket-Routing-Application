package com.example.itsupport.ITSupportTicketRoutingApplication.service;


import com.example.itsupport.ITSupportTicketRoutingApplication.util.MockAIResponse;
import org.springframework.stereotype.Service;

@Service
public class MockAIClient {

    public MockAIResponse getTicketRoutingInfo(String description) {
        String team = "General Support";
        String priority = "Low";
        String lowerDesc = description.toLowerCase();

        // Determine team based on keywords and additional conditions
        if(lowerDesc.contains("security") || lowerDesc.contains("breach") || lowerDesc.contains("attack")){
            team = "Security Team";
        } else if(lowerDesc.contains("cloud") || lowerDesc.contains("aws") || lowerDesc.contains("azure") || lowerDesc.contains("gcp")){
            team = "Cloud Support";
        } else if(lowerDesc.contains("database") || lowerDesc.contains("sql") || lowerDesc.contains("query") || lowerDesc.contains("db")){
            team = "Database Team";
        } else if(lowerDesc.contains("network") || lowerDesc.contains("wifi") || lowerDesc.contains("vpn") || lowerDesc.contains("ethernet") || lowerDesc.contains("connectivity")){
            team = "Network Team";
        } else if(lowerDesc.contains("software") || lowerDesc.contains("application") || lowerDesc.contains("bug") || lowerDesc.contains("crash")){
            team = "Software Support";
        } else if(lowerDesc.contains("hardware") || lowerDesc.contains("printer") || lowerDesc.contains("laptop") || lowerDesc.contains("desktop")){
            team = "Hardware Support";
        } else if(lowerDesc.contains("server") || lowerDesc.contains("infrastructure") || lowerDesc.contains("cooling") || lowerDesc.contains("power")){
            team = "Infrastructure Team";
        }

        // Determine priority based on keywords
        if(lowerDesc.contains("urgent") || lowerDesc.contains("immediately") || lowerDesc.contains("asap")){
            priority = "High";
        } else if(lowerDesc.contains("soon") || lowerDesc.contains("quick") || lowerDesc.contains("shortly")){
            priority = "Medium";
        } else {
            priority = "Low";
        }

        return new MockAIResponse(team, priority);
    }
}
