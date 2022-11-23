package com.siva.siva.sivasecurity.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "show_id")
    private long showId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "ticket_count")
    private int ticketCount;

    private String status;


}
