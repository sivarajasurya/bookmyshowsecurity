package com.siva.siva.sivasecurity.service;

import com.siva.siva.sivasecurity.dto.BookingDetailDto;
import com.siva.siva.sivasecurity.model.Booking;

import java.util.List;

public interface BookingService {
    void saveBookingDetails(Booking booking);


    List<Booking> viewAllBooking();

    BookingDetailDto findBookingDetailsByBookingId(long bookingId);
}
