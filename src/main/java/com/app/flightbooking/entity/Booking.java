package com.app.flightbooking.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pnr_number")
    private int pnr_number;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="flight_id")
    private Flight flight;
    @Column(name="booking_date")
    private Date booking_date;
    @Column(name="seats")
    private String seats;
    @Column(name="meal_required")
    private boolean meal_required;
    @Column(name="booking_status")
    private String booking_status;

    public Booking() {  }

    public Booking(User user, Flight flight, Date booking_date, String seats, boolean meal_required,
                   String booking_status) {
        this.user = user;
        this.flight = flight;
        this.booking_date = booking_date;
        this.seats = seats;
        this.meal_required = meal_required;
        this.booking_status = booking_status;
    }

    public int getPnr_number() {
        return pnr_number;
    }

    public void setPnr_number(int pnr_number) {
        this.pnr_number = pnr_number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public boolean isMeal_required() {
        return meal_required;
    }

    public void setMeal_required(boolean meal_required) {
        this.meal_required = meal_required;
    }

    public String getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.booking_status = booking_status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "pnr_number=" + pnr_number +
                ", user=" + user.getUser_id() +
                ", flight_id=" + flight.getFlight_id() +
                ", booking_date=" + booking_date +
                ", seats='" + seats + '\'' +
                ", meal_required=" + meal_required +
                ", booking_status='" + booking_status + '\'' +
                '}';
    }
}
