package br.com.gasinflamavel.TheTimer.qualify.persistence;

import br.com.gasinflamavel.TheTimer.qualify.Drop;

public interface RacerDao {

	public void addNewRacer(int racerId, String Name);
	public void addDrop(int racerId, Drop drop);
	public Drop getFastestDrop(int racerId);
	
}
