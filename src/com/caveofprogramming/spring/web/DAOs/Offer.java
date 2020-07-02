package com.caveofprogramming.spring.web.DAOs;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer {
	private int id;
	@Size(min = 1, max = 20)
	private String name;
	@NotNull
	@Pattern(regexp = ".*\\@.*\\..*		")
	private String email;
	@Size(min = 20, max = 255, message = "Text must be between 20 and 255 charcters.")
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
}
