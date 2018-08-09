package br.com.gasinflamavel.TheTimer.qualify.persistence;

import br.com.gasinflamavel.TheTimer.qualify.Racer;

public interface QualifySessionDao {
	public void addNewQualifySession(int sessionId, String label);
	public void addRacer(Racer racer);
}
