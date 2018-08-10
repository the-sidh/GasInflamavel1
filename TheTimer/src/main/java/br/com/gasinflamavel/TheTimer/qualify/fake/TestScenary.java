package br.com.gasinflamavel.TheTimer.qualify.fake;

import java.util.ArrayList;
import java.util.List;

import br.com.gasinflamavel.TheTimer.qualify.Drop;
import br.com.gasinflamavel.TheTimer.qualify.Qualify;
import br.com.gasinflamavel.TheTimer.qualify.QualifySession;
import br.com.gasinflamavel.TheTimer.qualify.RaceCategory;
import br.com.gasinflamavel.TheTimer.qualify.Racer;

public class TestScenary {

	private List<Qualify> races = new ArrayList<Qualify>();
	
	public static TestScenary instance;
	
	public static TestScenary getInstance() {
		if(instance==null) {
			instance=new TestScenary();
			instance.init();
		}
		return instance;
	}

	public void init() {
		List<QualifySession> sessions = new ArrayList<QualifySession>();
		RaceCategory categ1 = new RaceCategory(1, "Open");
		RaceCategory categ2 = new RaceCategory(2, "Feminino");
		Racer racer1 = new Racer(1, 1, "Joao");
		racer1.getCategories().add(categ1);
		Racer racer2 = new Racer(2, 2, "Jose");
		racer2.getCategories().add(categ1);
		Racer racer3 = new Racer(3, 3, "Lara");
		racer3.getCategories().add(categ2);

		Drop drop1_1 = new Drop(racer1, 0, 120);
		Drop drop1_2 = new Drop(racer2, 0, 119);
		Drop drop1_3 = new Drop(racer3, 0, 118);
		Drop drop2_1 = new Drop(racer1, 0, 119);
		Drop drop2_2 = new Drop(racer2, 0, 117);
		Drop drop2_3 = new Drop(racer3, 0, 118);

		QualifySession session1 = new QualifySession(1, "Drop 1");
		QualifySession session2 = new QualifySession(2, "Drop 2");

		session1.getDrops().add(drop1_1);
		session1.getDrops().add(drop1_2);
		session1.getDrops().add(drop1_3);

		session2.getDrops().add(drop2_1);
		session2.getDrops().add(drop2_2);
		session2.getDrops().add(drop2_3);

		sessions.add(session1);
		sessions.add(session2);

		Qualify qualify = new Qualify(1);
		qualify.getSessions().add(session1);
		qualify.getSessions().add(session2);

		races.add(qualify);
	}

	public List<Qualify> getRaces() {
		return races;
	}

}
