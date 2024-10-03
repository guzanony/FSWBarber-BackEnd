package com.example.FSW_Barber.domain.barberShop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
@Data
public class BarberShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String address;
    private byte[] imageUrl;
    private String phones;

    public void setImageUrl(byte[] imageUrl) {
        this.imageUrl = imageUrl;
    }
}
