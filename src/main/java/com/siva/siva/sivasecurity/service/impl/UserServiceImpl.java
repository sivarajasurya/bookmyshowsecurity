package com.siva.siva.sivasecurity.service.impl;


import com.siva.siva.sivasecurity.dto.BookSeatForShowRequest;
import com.siva.siva.sivasecurity.dto.BookSeatForShowResponse;
import com.siva.siva.sivasecurity.dto.AllTheaterByMovieNameDto;
import com.siva.siva.sivasecurity.model.Booking;
import com.siva.siva.sivasecurity.model.User;
import com.siva.siva.sivasecurity.repository.UserRepository;
import com.siva.siva.sivasecurity.service.BookingService;
import com.siva.siva.sivasecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookingService bookingService;

    @Override
    public List<AllTheaterByMovieNameDto> getAllPost() {
        List<AllTheaterByMovieNameDto> t = restTemplate.getForObject("http://localhost:8080/findAllShowScreenByMoviesName/avathar 2", List.class);
        return t;
    }

    @Override
    public BookSeatForShowResponse bookSeatForShowScreen(BookSeatForShowRequest request) {
//        HttpEntity<BookSeatForShowRequest> request = new HttpEntity<>(new BookSeatForShowRequest(1l,20));
        System.out.println(request + "\n -----------------------------------------------------------------------------------------------------------");
        BookSeatForShowResponse seat = restTemplate.postForObject("http://localhost:8080//bookSeatForShowScreen", request, BookSeatForShowResponse.class);
        System.out.println(seat);
        return seat;
    }

    @Override
    public BookSeatForShowResponse bookSeatAvailableForShowScreens(long showId, int numOfTickets) {
        BookSeatForShowResponse seat = restTemplate.getForObject("http://localhost:8080//bookSeatForShowScreen/" + showId + "/" + numOfTickets, BookSeatForShowResponse.class);
        System.out.println(seat);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();

        Optional<User> user = this.getUserDetailsByUserName(userName);
        Booking booking = new Booking();

        booking.setShowId(showId);
        booking.setUserId(user.get().getId());
        booking.setTicketCount(seat.getBookedSeats());
        if (seat.getBookedSeats()==0){
            booking.setStatus("Failed");
        }else {
            booking.setStatus("Success");
        }

        bookingService.saveBookingDetails(booking);
        return seat;
    }


    @Override
    public Optional<User> getUserDetailsByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


    @Override
    public void getAllPostByUserId(Long userId) {
    }
}
