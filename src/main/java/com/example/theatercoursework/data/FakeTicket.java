package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Ticket;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeTicket {
    private List<Ticket> tickets = new ArrayList<>(Arrays.asList(
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build(),
            Ticket.builder()
                  .id(null)
                  .performance(null)
                  .placeType(null)
                  .price(null)
                  .description("")
                  .created_at(LocalDateTime.now())
                  .modified_at(LocalDateTime.now())
                  .build()
                                                                ));

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
