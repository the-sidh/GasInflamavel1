package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class Qualify {

	private int raceId;
	
	List<QualifySession> sessions = new ArrayList<QualifySession>();
	
	
	public Qualify(int raceId) {
		super();
		this.raceId = raceId;
	}

	public List<QualifySession> getSessions() {
		return sessions;
	}

	public void setSessions(List<QualifySession> sessions) {
		this.sessions = sessions;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}
	
	
}
