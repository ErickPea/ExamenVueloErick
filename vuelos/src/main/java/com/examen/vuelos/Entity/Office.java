package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Table(name="Office")
@Entity
public class Office extends ABaseEntity{
	@Id
	 private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", nullable = true)
    private Country country;
	
	@Column(name = "title", length = 50, nullable = false)
    private String title;
	
	@Column(name = "phone", length = 50, nullable = false)
    private String phone;
	
	@Column(name = "contact", length = 50, nullable = false)
    private String contact;
	
	
	
	
	
	
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
