package com.siva.siva.sivasecurity.dto;



import lombok.Data;

import java.util.List;

@Data
public class MovieNameDto {
    private String movieName;
    private List<ShowScreenTimingDto> screenTiming;
}
