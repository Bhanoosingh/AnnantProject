package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
          @Id
	private String email;
	private String password;
	private boolean enabled;
	
	@OneToOne(mappedBy="user")
	private Customer customer;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

/*	public Authorities getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}

	@OneToOne(mappedBy="id")
	private Authorities authorities;*/
	
	private int authorities_id;

	/**
	 * @return the authorities_id
	 */
	public int getAuthorities_id() {
		return authorities_id;
	}

	/**
	 * @param authorities_id the authorities_id to set
	 */
	public void setAuthorities_id(int authorities_id) {
		this.authorities_id = authorities_id;
	}
}
