package com.portfoliomanagment.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


@Table(name="position")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionRef;

    @OneToOne()
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolio_number")
    private Portfolio portfolio;

    @OneToOne()
    @JoinColumn(name = "instrument_id", referencedColumnName = "id")
    private Instrument instrument;

    @Column(name="instrument_value",nullable = false)
    private BigDecimal instrumentValue;

    @Column(name="instrument_unit", nullable = false)
    private int instrumentUnit;
}
