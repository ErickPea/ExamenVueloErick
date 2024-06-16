package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Aircraft ")
@Entity
public class Aircraft extends ABaseEntity {
	
	@Id
	
	private Long id;
	
	@Column(name = "name", length = 50, nullable = false)
    private String name;
	
	@Column(name = "make_model", length = 50, nullable = false)
    private String make_model;
	@Column(name = "total_seats", length = 50, nullable = false)
    private String Total_Seats;
	@Column(name = "economy_seats", length = 50, nullable = false)
    private String economy_seats;
	@Column(name = "business_seats", length = 50, nullable = false)
    private String business_seats;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getMake_model() {
		return make_model;
	}
	public void setMake_model(String make_model) {
		this.make_model = make_model;
	}
	public String getTotal_Seats() {
		return Total_Seats;
	}
	public void setTotal_Seats(String total_Seats) {
		Total_Seats = total_Seats;
	}
	public String getEconomy_seats() {
		return economy_seats;
	}
	public void setEconomy_seats(String economy_seats) {
		this.economy_seats = economy_seats;
	}
	public String getBusiness_seats() {
		return business_seats;
	}
	public void setBusiness_seats(String business_seats) {
		this.business_seats = business_seats;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
