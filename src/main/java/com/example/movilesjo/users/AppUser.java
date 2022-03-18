package com.example.movilesjo.users;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@ElementCollection
	@CollectionTable(name = "roles", joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "roles")
	private Collection<String> roles = new ArrayList<>();

	public AppUser() {

	}

	public Long getId() {
		return user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Collection<String> roles) {
		this.roles = roles;
	}

	public AppUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void addRole(String role) {
		this.roles.add(role);
	}

	public String[] getRoles() {
		return this.roles.toArray(new String[0]);
	}
}
