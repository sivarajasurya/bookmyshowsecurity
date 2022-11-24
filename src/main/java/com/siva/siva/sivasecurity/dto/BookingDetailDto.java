package com.siva.siva.sivasecurity.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookingDetailDto {

    private long bookingId;

    private String theaterName;

    private String movieName;

    private LocalDateTime date;

    private int ticketCount;

}
