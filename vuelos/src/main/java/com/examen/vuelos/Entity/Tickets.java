package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="Tickets ")
@Entity
public class Tickets extends ABaseEntity {
	
	@Id
	private Long id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", nullable = true)
    private Users users;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "schedule_id", nullable = true)
    private Schedules schedule;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cabin_type_id", nullable = true)
    private Cabin_Type cabin_type;
	
	@Column(name = "first_name", length = 50, nullable = false)
    private String first_name;
	
	@Column(name = "last_name", length = 50, nullable = false)
    private String last_name;
	
	@Column(name = "email", length = 50, nullable = false)
    private String email;
	
	@Column(name = "phoned", length = 50, nullable = false)
    private String phoned;
	
	@Column(name = "passport_number", length = 50, nullable = false)
    private String passport_number;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "passport_country_id", nullable = true)
    private Country passport_country;
	
	@Column(name = "passport_photo", length = 50, nullable = false)
    private String passport_photo;
	
	@Column(name = "booking_reference", length = 50, nullable = false)
    private String booking_reference;
	
	@Column(name = "confirmed", length = 50, nullable = false)
    private String confirmed;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Schedules getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedules schedule) {
		this.schedule = schedule;
	}
	public Cabin_Type getCabin_type() {
		return cabin_type;
	}
	public void setCabin_type(Cabin_Type cabin_type) {
		this.cabin_type = cabin_type;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoned() {
		return phoned;
	}
	public void setPhoned(String phoned) {
		this.phoned = phoned;
	}
	public String getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}
	public Country getPassport_country() {
		return passport_country;
	}
	public void setPassport_country(Country passport_country) {
		this.passport_country = passport_country;
	}
	public String getPassport_photo() {
		return passport_photo;
	}
	public void setPassport_photo(String passport_photo) {
		this.passport_photo = passport_photo;
	}
	public String getBooking_reference() {
		return booking_reference;
	}
	public void setBooking_reference(String booking_reference) {
		this.booking_reference = booking_reference;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	

}
