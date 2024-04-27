package com.portfoliomanagment.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="instrument")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

//    @Enumerated(EnumType.ORDINAL)
//    @Column(name="trade_type")
//    private TradeType tradeType;

    // actual market price
    @Column(name="trade_value")
    private BigDecimal tradeValue;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="instrument_type",nullable = false)
    private InstrumentType instrumentType;
}
