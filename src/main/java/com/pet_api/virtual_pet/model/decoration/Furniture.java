package com.pet_api.virtual_pet.model.decoration;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "furniture")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String category;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "happiness_boost")
    private int happinessBoost; // Happiness boost when placing furniture

    @Column(name = "energy_boost")
    private int energyBoost; // Energy boost when interacting with furniture

    @Column(nullable = false)
    private String rarity; // "common", "uncommon", "rare", "legendary"

    @Column(name = "is_interactive", nullable = false)
    private boolean isInteractive; // If the villager can interact with this furniture
}