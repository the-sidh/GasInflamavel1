package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class QualifySession {
	private int sessionId;
	private String label;
	private List<Racer> racers = new ArrayList<Racer>();


	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public List<Racer> getRacers() {
		return racers;
	}

	public void setRacers(List<Racer> racers) {
		this.racers = racers;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
