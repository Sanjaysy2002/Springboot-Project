package com.Happy.entity;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.Data;
	

	@Data
	@Entity
	@Table(name = "contact_us")
	public class Contact {
	    @Id
	    private String userName;
	    private String userEmail;
	    private String userPhone;
	    private String userMsg;

	}

