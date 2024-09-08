package com.example.FSW_Barber.domain.barberShopService;

import com.example.FSW_Barber.domain.barberShop.BarberShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberShopServiceRepository extends JpaRepository<BarberShopService, Long> {
}
