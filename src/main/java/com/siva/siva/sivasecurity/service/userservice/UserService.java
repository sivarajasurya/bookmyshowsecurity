package com.siva.siva.sivasecurity.service.userservice;



import com.siva.siva.sivasecurity.dto.BookTicketDto.BookSeatForShowRequest;
import com.siva.siva.sivasecurity.dto.BookTicketDto.BookSeatForShowResponse;
import com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ListAllTheaterByMovieName.AllTheaterByMovieNameDto;
import com.siva.siva.sivasecurity.model.Booking;
import com.siva.siva.sivasecurity.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserDetailsByUserName(String userName);

    public void getAllPostByUserId(Long userId);

    BookSeatForShowResponse bookSeatForShowScreen(BookSeatForShowRequest request);

    BookSeatForShowResponse bookSeatAvailableForShowScreens(long showId,int numOfTickets);
    public List<AllTheaterByMovieNameDto> getAllPost();



}
