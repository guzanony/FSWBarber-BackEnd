package com.example.FSW_Barber.controllers.barberShopController;


import com.example.FSW_Barber.domain.barberShop.BarberShop;
import com.example.FSW_Barber.domain.barberShop.BarberShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/barbershops")
public class BarberShopController {

    @Autowired
    private BarberShopRepository barberShopRepository;

    @GetMapping
    public List<BarberShop> getAllBarberShops() {
        return barberShopRepository.findAll();
    }

    @PostMapping
    public BarberShop createBarberShop(@RequestBody BarberShop barberShop) {
        return barberShopRepository.save(barberShop);
    }
}
