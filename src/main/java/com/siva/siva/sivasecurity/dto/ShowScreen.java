package com.siva.siva.sivasecurity.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ShowScreen {

    private long showId;

    private LocalDateTime date;

    private int totalSeat;

    private int bookedSeat;

    private Theater theater;

    private Movie movie;

}
