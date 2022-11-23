package com.siva.siva.sivasecurity.service.bookingservice;

import com.siva.siva.sivasecurity.dto.BookingDetailDto;
import com.siva.siva.sivasecurity.dto.bookmyshowdto.ShowScreenDto;
import com.siva.siva.sivasecurity.model.Booking;
import com.siva.siva.sivasecurity.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void saveBookingDetails(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> viewAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public BookingDetailDto findBookingDetailsByBookingId(long bookingId) {

        Optional<Booking> booking = bookingRepository.findById(bookingId);
        long showId = booking.get().getShowId();

        ShowScreenDto seat = restTemplate.getForObject("http://localhost:8080/getShowScreenByShowId/" + showId , ShowScreenDto.class);

        BookingDetailDto dto = new BookingDetailDto();

        dto.setBookingId(booking.get().getId());
        dto.setMovieName(seat.getMovieDto().getMovieName());
        dto.setTheaterName(seat.getMovieDto().getMovieName());
        dto.setDate(seat.getDate());
        dto.setTicketCount(booking.get().getTicketCount());

        return dto;
    }

}
