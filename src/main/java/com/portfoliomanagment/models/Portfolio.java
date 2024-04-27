package com.portfoliomanagment.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="portfolio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Portfolio {
    @Id
    @Column(name="portfolio_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer portfolioNumber;

//    @Column(name="customer_id", nullable = false)
//    private Integer customerId;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="investment_strategy")
    private InvestmentStrategy investmentStrategy;

    //    private BigDecimal portfolioValue;
//    public BigDecimal getPortfolioValue() {
//        return new BigDecimal(0);
//    }

    //    private double currentPerformance;
//    public double getCurrentPerformance() {
//        return 0;
//    }
}
