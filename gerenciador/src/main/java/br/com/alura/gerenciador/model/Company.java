package br.com.alura.gerenciador.model;

import java.util.Date;

public class Company {
	private Integer id;
	
	private String name;
	
	private Date date = new Date();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
