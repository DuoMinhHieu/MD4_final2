package com.example.model;


import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(nullable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private String serviceType;

    @Column(nullable = false)
    private double unitPrice;

    @Column(nullable = false)
    private double area;
}

