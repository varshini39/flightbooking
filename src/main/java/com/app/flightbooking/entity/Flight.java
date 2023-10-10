package com.app.flightbooking.entity;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_id")
    private int flight_id;
    @Column(name="airline_name")
    private String airline_name;
    @Column(name="from")
    private String from;
    @Column(name="to")
    private String to;
    @Column(name="start_time")
    private Time start_time;
    @Column(name="end_time")
    private Time end_time;
    @Column(name="rate")
    private int rate;
    @Column(name="total_seats")
    private int total_seats;
    @Column(name="available_seats")
    private int available_seats;

    public Flight() {   }

    public Flight(String airline_name, String from, String to, Time start_time, Time end_time, int rate,
                  int total_seats,
                  int available_seats) {
        this.airline_name = airline_name;
        this.from = from;
        this.to = to;
        this.start_time = start_time;
        this.end_time = end_time;
        this.rate = rate;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public String getTo() {
        return to;
    }
    
    public void setTo(String to) {
        this.to = to;
    }
    
    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flight_id=" + flight_id +
                ", airline_name='" + airline_name + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", rate=" + rate +
                ", total_seats=" + total_seats +
                ", available_seats=" + available_seats +
                '}';
    }
}
