package com.sq022groupA.escalayt.repository;

import com.sq022groupA.escalayt.entity.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
