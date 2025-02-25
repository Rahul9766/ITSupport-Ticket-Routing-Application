package com.example.itsupport.ITSupportTicketRoutingApplication.controller;


import com.example.itsupport.ITSupportTicketRoutingApplication.dto.TicketRequest;
import com.example.itsupport.ITSupportTicketRoutingApplication.dto.TicketResponse;
import com.example.itsupport.ITSupportTicketRoutingApplication.model.Ticket;
import com.example.itsupport.ITSupportTicketRoutingApplication.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public ResponseEntity<TicketResponse> createTicket(@RequestBody TicketRequest request) {
        Ticket ticket = ticketService.createTicket(request.getDescription());
        TicketResponse response = new TicketResponse(
                ticket.getId(),
                ticket.getAssignedTeam(),
                ticket.getStatus(),
                ticket.getPriority(),
                "Ticket created successfully!"
        );
        return ResponseEntity.ok(response);
    }
}
