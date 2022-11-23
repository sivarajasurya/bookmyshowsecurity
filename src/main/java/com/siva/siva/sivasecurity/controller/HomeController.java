package com.siva.siva.sivasecurity.controller;

import com.siva.siva.sivasecurity.dto.BookTicketDto.BookSeatForShowRequest;
import com.siva.siva.sivasecurity.dto.BookTicketDto.BookSeatForShowResponse;
import com.siva.siva.sivasecurity.dto.BookingDetailDto;
import com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ListAllTheaterByMovieName.AllTheaterByMovieNameDto;
import com.siva.siva.sivasecurity.model.Booking;
import com.siva.siva.sivasecurity.service.bookingservice.BookingService;
import com.siva.siva.sivasecurity.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookingService bookingService;

    @GetMapping("/user/showScreen")
    public List<AllTheaterByMovieNameDto> getAllPosts() {
        return userService.getAllPost();
    }

    @PostMapping("/admin/booking")
    public BookSeatForShowResponse bookSeatForShowScreen(@RequestBody BookSeatForShowRequest request) {
        return userService.bookSeatForShowScreen(request);
    }

    //BookTickets endpoint
    @GetMapping("/user/BookTickets/{showId}/{numOfTicket}")
    public BookSeatForShowResponse bookSeatAvailableForShowScreens(@PathVariable long showId, @PathVariable int numOfTicket) {
        return userService.bookSeatAvailableForShowScreens(showId, numOfTicket);
    }

    //ViewAllBookings (Both successful and Failed) endpoint
    @GetMapping("/admin/viewAllBookings")
    public List<Booking> viewAllBookings(){
        return bookingService.viewAllBooking();
    }

    //BookingDetail/{BookingId} endpoint
    @GetMapping("/user/BookingDetail/{bookingId}")
    public BookingDetailDto findBookingDetailsByBookingId(@PathVariable long bookingId){
        return bookingService.findBookingDetailsByBookingId(bookingId);
    }


    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome<h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome user<h1>");
    }

    @GetMapping("/admin/name")
    public String userName() {
        return ("<h1>Welcome admin name<h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome admin<h1>");
    }
}
