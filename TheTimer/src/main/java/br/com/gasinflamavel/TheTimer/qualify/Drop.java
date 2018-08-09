package br.com.gasinflamavel.TheTimer.qualify;

public class Drop {

	private Racer racer;
	private long start;
	private long finish;
	
	public Drop(Racer racer, long start, long finish) {
		super();
		this.racer = racer;
		this.start = start;
		this.finish = finish;
	}
	
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getFinish() {
		return finish;
	}
	public void setFinish(long finish) {
		this.finish = finish;
	}
	public Racer getRacer() {
		return racer;
	}
	public void setRacer(Racer racer) {
		this.racer = racer;
	}
	
	
	
}
