package com.example.FSW_Barber.domain.barberShopService;

import com.example.FSW_Barber.domain.barberShop.BarberShop;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BarberShopService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "barberShopId", nullable = false)
    private BarberShop barberShop;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
}
