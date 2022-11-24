package com.siva.siva.sivasecurity.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookSeatForShowResponse {

    private String theaterName;
    private String movieName;
    private int AvailableSeats;
    private int bookedSeats;
    private LocalDateTime showDateAndTiming;
    private String status;

}
