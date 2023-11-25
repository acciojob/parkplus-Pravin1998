package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private Integer paymentId;

    private Boolean paymentCompleted;

    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToOne(mappedBy = "payment",cascade = CascadeType.ALL)
    private Reservation reservation;

    public Payment() {
    }

    public Payment(Integer paymentId, Boolean paymentCompleted, PaymentMode paymentMode, Reservation reservation) {
        this.paymentId = paymentId;
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
        this.reservation = reservation;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Boolean getPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(Boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
