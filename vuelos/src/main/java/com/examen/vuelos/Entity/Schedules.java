package com.examen.vuelos.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="schedules ")
@Entity
public class Schedules extends ABaseEntity {
	@Id
	private Long id;
	

	@Column(name = "date", length = 50, nullable = false)
    private LocalDate date; //se coloca LocalDate  Para representar solo una fecha (sin hora)
	
	@Column(name = "time", length = 50, nullable = false)
    private LocalTime time; //se coloca  LocalTime Para representar solo una hora (sin fecha
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraft_id", nullable = true)
    private Aircraft aircraft;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "routes_id", nullable = true)
    private Routes routes;
	
	@Column(name = "economy_price", length = 50, nullable = false)
    private String economy_price;
	
	@Column(name = "confirmed", length = 50, nullable = false)
    private String confirmed;
	
	@Column(name = "flightnumber", length = 50, nullable = false)
    private String flightnumber;

	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public Routes getRoutes() {
		return routes;
	}

	public void setRoutes(Routes routes) {
		this.routes = routes;
	}

	public String getEconomy_price() {
		return economy_price;
	}

	public void setEconomy_price(String economy_price) {
		this.economy_price = economy_price;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
