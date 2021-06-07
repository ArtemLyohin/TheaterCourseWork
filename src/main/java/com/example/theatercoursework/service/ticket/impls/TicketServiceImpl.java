package com.example.theatercoursework.service.ticket.impls;

import com.example.theatercoursework.data.FakeTicket;
import com.example.theatercoursework.model.Ticket;
import com.example.theatercoursework.model.enums.PlaceType;
import com.example.theatercoursework.repository.performance.PerformanceRepository;
import com.example.theatercoursework.repository.ticket.TicketRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.service.ticket.interfaces.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService {
    @Autowired
    TicketRepository repository;

    @Autowired
    FakeTicket fakeTicket;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    PerformanceRepository performanceRepository;

    @PostConstruct
    void init() {
//        fakeTicket.getTickets().get(0).setPerformance(performanceRepository.findAll().get(0));
//        fakeTicket.getTickets().get(0).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(0)
//                  .setPrice(performanceRepository.findAll().get(0).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(0).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(1).setPerformance(performanceRepository.findAll().get(0));
//        fakeTicket.getTickets().get(1).setPlaceType(PlaceType.VIP);
//        fakeTicket.getTickets()
//                  .get(1)
//                  .setPrice(performanceRepository.findAll().get(0).getSpectacle().getPriceForUsual()
//                            * PlaceType.VIP.getValue()
//                            * performanceRepository.findAll().get(0).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(2).setPerformance(performanceRepository.findAll().get(1));
//        fakeTicket.getTickets().get(2).setPlaceType(PlaceType.BALCONY);
//        fakeTicket.getTickets()
//                  .get(2)
//                  .setPrice(performanceRepository.findAll().get(1).getSpectacle().getPriceForUsual()
//                            * PlaceType.BALCONY.getValue()
//                            * performanceRepository.findAll().get(1).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(3).setPerformance(performanceRepository.findAll().get(1));
//        fakeTicket.getTickets().get(3).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(3)
//                  .setPrice(performanceRepository.findAll().get(1).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(1).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(4).setPerformance(performanceRepository.findAll().get(2));
//        fakeTicket.getTickets().get(4).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(4)
//                  .setPrice(performanceRepository.findAll().get(2).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(2).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(5).setPerformance(performanceRepository.findAll().get(2));
//        fakeTicket.getTickets().get(5).setPlaceType(PlaceType.VIP);
//        fakeTicket.getTickets()
//                  .get(5)
//                  .setPrice(performanceRepository.findAll().get(2).getSpectacle().getPriceForUsual()
//                            * PlaceType.VIP.getValue()
//                            * performanceRepository.findAll().get(2).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(6).setPerformance(performanceRepository.findAll().get(3));
//        fakeTicket.getTickets().get(6).setPlaceType(PlaceType.VIP);
//        fakeTicket.getTickets()
//                  .get(6)
//                  .setPrice(performanceRepository.findAll().get(3).getSpectacle().getPriceForUsual()
//                            * PlaceType.VIP.getValue()
//                            * performanceRepository.findAll().get(3).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(7).setPerformance(performanceRepository.findAll().get(3));
//        fakeTicket.getTickets().get(7).setPlaceType(PlaceType.BALCONY);
//        fakeTicket.getTickets()
//                  .get(7)
//                  .setPrice(performanceRepository.findAll().get(3).getSpectacle().getPriceForUsual()
//                            * PlaceType.BALCONY.getValue()
//                            * performanceRepository.findAll().get(3).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(8).setPerformance(performanceRepository.findAll().get(4));
//        fakeTicket.getTickets().get(8).setPlaceType(PlaceType.BALCONY);
//        fakeTicket.getTickets()
//                  .get(8)
//                  .setPrice(performanceRepository.findAll().get(4).getSpectacle().getPriceForUsual()
//                            * PlaceType.BALCONY.getValue()
//                            * performanceRepository.findAll().get(4).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(9).setPerformance(performanceRepository.findAll().get(4));
//        fakeTicket.getTickets().get(9).setPlaceType(PlaceType.BALCONY);
//        fakeTicket.getTickets()
//                  .get(9)
//                  .setPrice(performanceRepository.findAll().get(4).getSpectacle().getPriceForUsual()
//                            * PlaceType.BALCONY.getValue()
//                            * performanceRepository.findAll().get(4).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(10).setPerformance(performanceRepository.findAll().get(5));
//        fakeTicket.getTickets().get(10).setPlaceType(PlaceType.VIP);
//        fakeTicket.getTickets()
//                  .get(10)
//                  .setPrice(performanceRepository.findAll().get(5).getSpectacle().getPriceForUsual()
//                            * PlaceType.VIP.getValue()
//                            * performanceRepository.findAll().get(5).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(11).setPerformance(performanceRepository.findAll().get(6));
//        fakeTicket.getTickets().get(11).setPlaceType(PlaceType.VIP);
//        fakeTicket.getTickets()
//                  .get(11)
//                  .setPrice(performanceRepository.findAll().get(6).getSpectacle().getPriceForUsual()
//                            * PlaceType.VIP.getValue()
//                            * performanceRepository.findAll().get(6).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(12).setPerformance(performanceRepository.findAll().get(7));
//        fakeTicket.getTickets().get(12).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(12)
//                  .setPrice(performanceRepository.findAll().get(7).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(7).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(13).setPerformance(performanceRepository.findAll().get(8));
//        fakeTicket.getTickets().get(13).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(13)
//                  .setPrice(performanceRepository.findAll().get(8).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(8).getPerformanceType().getValue());
//        //NEW
//        fakeTicket.getTickets().get(14).setPerformance(performanceRepository.findAll().get(9));
//        fakeTicket.getTickets().get(14).setPlaceType(PlaceType.USUAL);
//        fakeTicket.getTickets()
//                  .get(14)
//                  .setPrice(performanceRepository.findAll().get(9).getSpectacle().getPriceForUsual()
//                            * PlaceType.USUAL.getValue()
//                            * performanceRepository.findAll().get(9).getPerformanceType().getValue());
//
//
//        repository.saveAll(fakeTicket.getTickets());
    }

    @Override
    public Ticket create(Ticket ticket) {
        ticket.setModified_at(LocalDateTime.now());
        ticket.setCreated_at(LocalDateTime.now());
        ticket.setPrice(ticket.getPerformance().getSpectacle().getPriceForUsual()
                        * ticket.getPlaceType().getValue()
                       * ticket.getPerformance().getPerformanceType().getValue());
        return repository.save(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        ticket.setModified_at(LocalDateTime.now());
        ticket.setPrice(ticket.getPerformance().getSpectacle().getPriceForUsual()
                        * ticket.getPlaceType().getValue()
                        * ticket.getPerformance().getPerformanceType().getValue());
        return repository.save(ticket);
    }

    @Override
    public Ticket delete(Ticket ticket) {
        repository.delete(ticket);

        return ticket;
    }

    @Override
    public Ticket getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Ticket> getAll() {
        return repository.findAll();
    }
}
