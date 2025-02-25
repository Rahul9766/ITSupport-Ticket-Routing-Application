package com.example.itsupport.ITSupportTicketRoutingApplication.repository;

import com.example.itsupport.ITSupportTicketRoutingApplication.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
