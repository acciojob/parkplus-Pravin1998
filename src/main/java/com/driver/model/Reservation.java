package com.driver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;

    private int noOfHours;

    @ManyToOne
    @JoinColumn
    private Spot spot;

    @OneToOne
    @JoinColumn
    private Payment payment;

    @ManyToOne
    @JoinColumn
    private User user;

    public Reservation() {
    }

    public Reservation(int reservationId, int noOfHours, Spot spot, Payment payment, User user) {
        this.reservationId = reservationId;
        this.noOfHours = noOfHours;
        this.spot = spot;
        this.payment = payment;
        this.user = user;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
