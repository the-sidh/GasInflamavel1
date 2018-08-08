package br.com.gasinflamavel.TheTimer.racer;

import java.util.ArrayList;
import java.util.List;

import br.com.gasinflamavel.TheTimer.qualify.Drop;

public class Racer implements Dropable{

	private int id;
	private int receiverNumber;
	private String name;
	private List<Drop> drops = new ArrayList<Drop>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReceiverNumber() {
		return receiverNumber;
	}
	public void setReceiverNumber(int receiverNumber) {
		this.receiverNumber = receiverNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addDrop(Drop drop) {
		
	}
	
	
}
