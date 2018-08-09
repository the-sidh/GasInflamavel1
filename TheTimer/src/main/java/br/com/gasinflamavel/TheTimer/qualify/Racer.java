package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class Racer {

	private int racerId;
	private int TransponderNumber;
	private String name;
	private List<RaceCategory> categories = new ArrayList<RaceCategory>();

	public Racer(int racerId, int transponderNumber, String name) {
		super();
		this.racerId = racerId;
		TransponderNumber = transponderNumber;
		this.name = name;
	}

	public int getRacerId() {
		return racerId;
	}

	public void setRacerId(int racerId) {
		this.racerId = racerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTransponderNumber() {
		return TransponderNumber;
	}

	public void setTransponderNumber(int transponderNumber) {
		TransponderNumber = transponderNumber;
	}

	public List<RaceCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<RaceCategory> categories) {
		this.categories = categories;
	}
	
	

}
