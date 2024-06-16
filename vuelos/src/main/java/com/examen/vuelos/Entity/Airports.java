package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Table(name="Airports")
@Entity
public class Airports extends ABaseEntity {
	@Id
	 private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", nullable = true)
    private Country country;
	
	@Column(name = "iatacode", length = 50, nullable = false)
    private String iatacode;
	
	@Column(name = "name", length = 50, nullable = false)
    private String name;

	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	public String getIatacode() {
		return iatacode;
	}

	public void setIatacode(String iatacode) {
		this.iatacode = iatacode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
