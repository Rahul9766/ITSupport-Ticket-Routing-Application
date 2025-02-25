package com.example.itsupport.ITSupportTicketRoutingApplication.dto;


public class TicketResponse {
    private Long ticketId;
    private String assignedTeam;
    private String status;
    private String priority;
    private String message;

    public TicketResponse(Long ticketId, String assignedTeam, String status, String priority, String message) {
        this.ticketId = ticketId;
        this.assignedTeam = assignedTeam;
        this.status = status;
        this.priority = priority;
        this.message = message;
    }

    public Long getTicketId() {
        return ticketId;
    }
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
    public String getAssignedTeam() {
        return assignedTeam;
    }
    public void setAssignedTeam(String assignedTeam) {
        this.assignedTeam = assignedTeam;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
