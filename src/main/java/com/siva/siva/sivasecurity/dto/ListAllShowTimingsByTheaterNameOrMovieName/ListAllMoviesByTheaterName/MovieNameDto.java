package com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ListAllMoviesByTheaterName;



import com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ShowScreenTimingDto;
import lombok.Data;

import java.util.List;

@Data
public class MovieNameDto {
    private String movieName;
    private List<ShowScreenTimingDto> screenTiming;
}
