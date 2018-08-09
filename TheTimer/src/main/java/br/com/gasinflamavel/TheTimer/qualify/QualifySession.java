package br.com.gasinflamavel.TheTimer.qualify;

import java.util.ArrayList;
import java.util.List;

public class QualifySession {
	
	private int sessionId;
	private String label;
	private List<Drop> drops = new ArrayList<Drop>();

	public QualifySession(int sessionId, String label) {
		super();
		this.sessionId = sessionId;
		this.label = label;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public List<Drop> getDrops() {
		return drops;
	}

	public void setDrops(List<Drop> drops) {
		this.drops = drops;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
