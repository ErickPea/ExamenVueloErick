package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="Routes")
@Entity
public class Routes extends ABaseEntity{
@Id

private Long id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arrival_aiport_id", nullable = true)
    private Airports arrival_aiport;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_aiport_id", nullable = true)
    private Airports departure_aiport_id;
	
	@Column(name = "distance", length = 50, nullable = false)
    private String distance;
	
	@Column(name = "flight_time", length = 50, nullable = false)
    private String flight_time;

	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Airports getArrival_aiport() {
		return arrival_aiport;
	}

	public void setArrival_aiport(Airports arrival_aiport) {
		this.arrival_aiport = arrival_aiport;
	}

	public Airports getDeparture_aiport_id() {
		return departure_aiport_id;
	}

	public void setDeparture_aiport_id(Airports departure_aiport_id) {
		this.departure_aiport_id = departure_aiport_id;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}

	
}
