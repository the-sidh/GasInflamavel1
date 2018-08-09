package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class Racer implements Dropable{

	private int racerId;
	private int receiverNumber;
	private String name;
	private Drop drop;
	

	public int getRacerId() {
		return racerId;
	}
	public void setRacerId(int racerId) {
		this.racerId = racerId;
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
	public Drop getDrop() {
		return drop;
	}
	public void setDrop(Drop drop) {
		this.drop = drop;
	}

	
	
	
}
