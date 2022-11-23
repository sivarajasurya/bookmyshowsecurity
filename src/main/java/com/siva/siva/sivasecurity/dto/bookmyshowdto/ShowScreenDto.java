package com.siva.siva.sivasecurity.dto.bookmyshowdto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ShowScreenDto {

    private long showId;

    private LocalDateTime date;

    private int totalSeat;

    private int bookedSeat;

    private TheaterDto theaterDto;

    private MovieDto movieDto;

}
