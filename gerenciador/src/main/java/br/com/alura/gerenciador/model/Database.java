package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private static List<Company> companies = new ArrayList<Company>();

	public void add(Company company) {
		companies.add(company);
	}

	public List<Company> getCompanies() {
		return Database.companies;
	}
}
