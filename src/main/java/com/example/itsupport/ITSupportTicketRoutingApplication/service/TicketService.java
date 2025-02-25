package com.example.itsupport.ITSupportTicketRoutingApplication.service;


import com.example.itsupport.ITSupportTicketRoutingApplication.model.Ticket;
import com.example.itsupport.ITSupportTicketRoutingApplication.repository.TicketRepository;
import com.example.itsupport.ITSupportTicketRoutingApplication.util.MockAIResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final MockAIClient mockAIClient;

    public TicketService(TicketRepository ticketRepository, MockAIClient mockAIClient) {
        this.ticketRepository = ticketRepository;
        this.mockAIClient = mockAIClient;
    }

    @Transactional
    public Ticket createTicket(String description) {
        // Create a new ticket with status NEW
        Ticket ticket = new Ticket(description);
        ticket = ticketRepository.save(ticket);

        // Get routing information from the mock AI service based solely on the description.
        MockAIResponse response = mockAIClient.getTicketRoutingInfo(description);

        // Update the ticket with the assigned team, priority, and new status.
        ticket.setAssignedTeam(response.getTeam());
        ticket.setPriority(response.getPriority());
        ticket.setStatus("ASSIGNED");
        return ticketRepository.save(ticket);
    }
}

