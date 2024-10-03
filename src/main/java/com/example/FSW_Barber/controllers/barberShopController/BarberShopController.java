package com.example.FSW_Barber.controllers.barberShopController;


import com.example.FSW_Barber.domain.barberShop.BarberShop;
import com.example.FSW_Barber.domain.barberShop.BarberShopRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@CrossOrigin("*")
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
    public BarberShop createBarberShop(@RequestPart("barberShop") String barberShopJson, @RequestPart("imageUrl")MultipartFile imageFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        BarberShop barberShop = objectMapper.readValue(barberShopJson, BarberShop.class);
        barberShop.setImageUrl(imageFile.getBytes());
        return barberShopRepository.save(barberShop);
    }
}
