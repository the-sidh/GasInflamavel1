package br.com.gasinflamavel.TheTimer.qualify.persistence.dao;

import java.util.List;

import br.com.gasinflamavel.TheTimer.qualify.Drop;

public interface QualifyDao {

	public List<Drop> getFastestDrops();
	public Drop getFastestDrop();
	
}
