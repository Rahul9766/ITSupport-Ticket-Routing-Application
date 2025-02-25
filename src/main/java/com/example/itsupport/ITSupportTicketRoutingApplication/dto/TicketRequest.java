package com.example.itsupport.ITSupportTicketRoutingApplication.dto;


public class TicketRequest {
    private String description;

    public TicketRequest() {}

    public TicketRequest(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
