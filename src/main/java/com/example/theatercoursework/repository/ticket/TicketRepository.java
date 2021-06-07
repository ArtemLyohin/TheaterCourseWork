package com.example.theatercoursework.repository.ticket;

import com.example.theatercoursework.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
