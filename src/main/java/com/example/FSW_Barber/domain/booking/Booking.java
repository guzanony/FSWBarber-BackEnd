package com.example.FSW_Barber.domain.booking;

import com.example.FSW_Barber.domain.barberShopService.BarberShopService;
import com.example.FSW_Barber.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "serviceId", nullable = false)
    private BarberShopService service;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Customer user;
    private LocalDateTime date;
}
