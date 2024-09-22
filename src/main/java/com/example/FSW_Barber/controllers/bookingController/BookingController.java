package com.example.FSW_Barber.controllers.bookingController;

import com.example.FSW_Barber.domain.booking.Booking;
import com.example.FSW_Barber.domain.booking.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    @GetMapping("/barberShop/{barberShopId}/user/{userId}")
    public List<Booking> getBookingsByBarberShopAndUser(@PathVariable Long barberShopId, @PathVariable Long userId) {
        return bookingRepository.findByServiceBarberShopIdAndUserId(barberShopId, userId);
    }
}
