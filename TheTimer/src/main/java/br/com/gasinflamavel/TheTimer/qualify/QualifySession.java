package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

import br.com.gasinflamavel.TheTimer.racer.Racer;

public class QualifySession {
	private int id;
	private List<Racer> racers = new ArrayList<Racer>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Racer> getRacers() {
		return racers;
	}

	public void setRacers(List<Racer> racers) {
		this.racers = racers;
	}

}
