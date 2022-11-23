package com.siva.siva.sivasecurity.dto.ListAllShowTimingsByTheaterNameOrMovieName.ListAllMoviesByTheaterName;


import lombok.Data;

import java.util.List;

@Data
public class AllMoviesByTheaterNameDto {
    private String theaterName;
    private List<MovieNameDto> movieName;

}
