package com.siva.siva.sivasecurity.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookingDetailDto {

    private long bookingId;

    private String movieName;

    private String theaterName;

    private LocalDateTime date;

    private int ticketCount;

}
