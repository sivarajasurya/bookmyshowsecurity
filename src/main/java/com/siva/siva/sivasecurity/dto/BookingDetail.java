package com.siva.siva.sivasecurity.dto;

import lombok.Data;

@Data
public class BookingDetail {
    private long id;

    private long showId;

    private long userId;

    private int ticketCount;

    private String status;
}
