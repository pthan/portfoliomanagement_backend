package com.portfoliomanagment.models;


import jakarta.persistence.*;
import lombok.*;

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

    @Column(name="instrument_id",nullable = false)
    private String instrumentId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="instrument_id")
   // private Instrument instrument;
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//    private List<Audit> employees = new ArrayList<>();

    @Column(name="price",nullable = false)
    private  int price;
}
