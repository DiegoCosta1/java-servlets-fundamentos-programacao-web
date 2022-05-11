package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private static List<Company> companies = new ArrayList<Company>();
	
	static {
		Company alura = new Company();
		alura.setName("Alura");
		Company google = new Company();
		google.setName("Google");
		
		companies.add(alura);
		companies.add(google);
	}

	public void add(Company company) {
		companies.add(company);
	}

	public List<Company> getCompanies() {
		return Database.companies;
	}
}
