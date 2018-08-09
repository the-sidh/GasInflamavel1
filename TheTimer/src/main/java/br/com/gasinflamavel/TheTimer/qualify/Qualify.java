package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class Qualify {

	List<QualifySession> sessions = new ArrayList<QualifySession>();

	public List<QualifySession> getSessions() {
		return sessions;
	}

	public void setSessions(List<QualifySession> sessions) {
		this.sessions = sessions;
	}
}
