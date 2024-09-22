package com.example.FSW_Barber.controllers.barberShopServiceController;

import com.example.FSW_Barber.domain.barberShopService.BarberShopService;
import com.example.FSW_Barber.domain.barberShopService.BarberShopServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class BarberShopServiceController {

    @Autowired
    private BarberShopServiceRepository barberShopServiceRepository;

    @GetMapping
    public List<BarberShopService> getAllServices() {
        return barberShopServiceRepository.findAll();
    }

    @PostMapping
    public BarberShopService createService(@RequestBody BarberShopService service) {
        return barberShopServiceRepository.save(service);
    }

    @GetMapping("/barberShop/{barberShopId}")
    public List<BarberShopService> getServicesByBarberShop(@PathVariable Long barberShopId) {
        return barberShopServiceRepository.findByBarberShopId(barberShopId);
    }
}
