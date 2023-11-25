package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "spot")

public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spotId;

    @Enumerated(value = EnumType.STRING)
    private SpotType spotType;

    private int pricePerHour;

    private Boolean occupied;

    @ManyToOne
    @JoinColumn
    private ParkingLot parkingLot;

    @OneToMany(mappedBy = "spot", cascade = CascadeType.ALL)
    private List<Reservation> reservationList = new ArrayList<>();

    public Spot() {
    }

    public Spot(int spotId, SpotType spotType, int pricePerHour, Boolean occupied, ParkingLot parkingLot, List<Reservation> reservationList) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.pricePerHour = pricePerHour;
        this.occupied = occupied;
        this.parkingLot = parkingLot;
        this.reservationList = reservationList;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Integer pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
