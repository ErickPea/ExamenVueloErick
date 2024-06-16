package com.examen.vuelos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Role")
@Entity
public class Role extends ABaseEntity{

	@Id
	private Long id;
	@Column(name = "title", length = 50, nullable = false)
    private String title;

	
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

}
