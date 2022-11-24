package com.siva.siva.sivasecurity.service;



import com.siva.siva.sivasecurity.dto.BookSeatForShowRequest;
import com.siva.siva.sivasecurity.dto.BookSeatForShowResponse;
import com.siva.siva.sivasecurity.dto.AllTheaterByMovieNameDto;
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
