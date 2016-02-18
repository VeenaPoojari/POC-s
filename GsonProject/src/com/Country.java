package com;

import java.util.List;


class Country
{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	

	public List<String> getListOfStates() {
		return listOfStates;
	}

	public void setListOfStates(List<String> listOfStates) {
		this.listOfStates = listOfStates;
	}



	private int population;
	
	private List<String> listOfStates ;
	
}