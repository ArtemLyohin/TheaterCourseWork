package com.example.theatercoursework.service.ticket.interfaces;

import com.example.theatercoursework.model.Ticket;

import java.util.List;

public interface ITicketService {
    Ticket create(Ticket ticket);
    Ticket update(Ticket ticket);
    Ticket delete(Ticket ticket);
    Ticket getById(String id);
    List<Ticket> getAll();
}
