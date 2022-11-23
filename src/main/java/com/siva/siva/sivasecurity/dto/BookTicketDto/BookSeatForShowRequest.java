package com.siva.siva.sivasecurity.dto.BookTicketDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookSeatForShowRequest {

    private long showId;
    private int numOfTicket;

}
