package br.com.gasinflamavel.TheTimer;

public class TimerHelper {

	public static TimerHelper instance;
	
	public static TimerHelper getInstane() {
		if (instance == null)
			instance= new TimerHelper();
		
		return instance;
	}
	
	public long getDelta(int start, int finish) {
		return 0;
		
	}
	
}
