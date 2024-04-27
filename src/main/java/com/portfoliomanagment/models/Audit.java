package com.portfoliomanagment.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name="item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
/**
 * Author Phyo Thu Han
 * To process audit information
 */
public class Audit {
    @Id
    @Column(name="audit_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long auditId;

    @Column(name="transaction_ref",nullable = false)
    private String transactionRef;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="instrument_id")
    private Instrument instrument;

    @Column(name="price",nullable = false)
    private  int price;

    @Column(name="audit_date",nullable = false)
    private Date auditDate;
}
