package com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ListAllTheaterByMovieName;



import com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ShowScreenTimingDto;
import lombok.Data;

import java.util.List;

@Data
public class AllTheaterByMovieNameDto {

    private String movieName;

    private String theaterName;

    private List<ShowScreenTimingDto> showScreens;

}
