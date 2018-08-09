package br.com.gasinflamavel.TheTimer.qualify;

public class RaceCategory {

	int catId;
	String description;
	
	public RaceCategory(int catId, String description) {
		super();
		this.catId = catId;
		this.description = description;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
