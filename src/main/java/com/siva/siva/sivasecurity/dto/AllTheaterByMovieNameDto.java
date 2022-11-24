package com.siva.siva.sivasecurity.dto;



import lombok.Data;

import java.util.List;

@Data
public class AllTheaterByMovieNameDto {

    private String movieName;

    private String theaterName;

    private List<ShowScreenTimingDto> showScreens;

}
