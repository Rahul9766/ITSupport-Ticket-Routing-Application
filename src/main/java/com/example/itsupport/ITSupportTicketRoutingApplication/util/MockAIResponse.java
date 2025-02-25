package com.example.itsupport.ITSupportTicketRoutingApplication.util;



public class MockAIResponse {
    private String team;
    private String priority;

    public MockAIResponse(String team, String priority) {
        this.team = team;
        this.priority = priority;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
}

