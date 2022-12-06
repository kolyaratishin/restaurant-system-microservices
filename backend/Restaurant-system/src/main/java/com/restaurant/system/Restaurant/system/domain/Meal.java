package com.restaurant.system.Restaurant.system.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "meals")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Meal {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
