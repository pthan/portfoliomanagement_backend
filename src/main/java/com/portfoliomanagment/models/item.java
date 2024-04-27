package com.portfoliomanagment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long itemId;

    @Column(name="item_name",nullable = false)
    private String itemName;

    @Column(name="qty",nullable = false)
    private int qty;

    @Column(name="price",nullable = false)
    private  int price;
}
