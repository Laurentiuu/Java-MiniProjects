import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Controller {
	private View view;
	private Model model;
	private String s;

	Polinom polinom1 = new Polinom();
	Polinom polinom2 = new Polinom();
	Polinom rez = new Polinom();

	public Controller(View view, Model model) {
		this.model = model;
		this.view = view;

		view.addAduareListener(new AdunareListener());
		view.addScadereListener(new ScadereListener());
		view.addInmultireListener(new InmultireListener());
		view.addDerivareListener(new DerivareListener());

	}

	class AdunareListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			crearePolinoame();
			rez = model.adunare(polinom1, polinom2);
			s ="Rezultatul adunarii este:  "+ model.afisareRez(rez);
			checkError();
			view.setRez(s);
			Polinom.cleanPolinom(polinom1);
			Polinom.cleanPolinom(polinom2);
			Polinom.cleanPolinom(rez);
			s=null;
		}
	}

	class ScadereListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			crearePolinoame();
			rez = model.scadere(polinom1, polinom2);
			s ="Rezultatul scaderii este:  "+ model.afisareRez(rez);
			checkError();
			view.setRez(s);
			Polinom.cleanPolinom(polinom1);
			Polinom.cleanPolinom(polinom2);
			Polinom.cleanPolinom(rez);
			s=null;
		}
	}

	class InmultireListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			crearePolinoame();
			rez = model.inmultire(polinom1, polinom2);
			s ="Rezultatul inmultirii este:  "+ model.afisareRez(rez);
			checkError();
			view.setRez(s);
			Polinom.cleanPolinom(polinom1);
			Polinom.cleanPolinom(polinom2);
			Polinom.cleanPolinom(rez);
			s=null;

		}
	}

	class DerivareListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			crearePolinoame();
			rez = model.derivare(polinom1);
			s ="Rezultatul derivarii lui P1 este:  "+ model.afisareRez(rez);
			checkError();
			view.setRez(s);
			Polinom.cleanPolinom(polinom1);
			Polinom.cleanPolinom(polinom2);
			Polinom.cleanPolinom(rez);
			s=null;
		}
	}

	private void crearePolinoame() {
		polinom1.add(new Monom(view.getT1(), 5));
		polinom1.add(new Monom(view.getT2(), 4));
		polinom1.add(new Monom(view.getT3(), 3));
		polinom1.add(new Monom(view.getT4(), 2));
		polinom1.add(new Monom(view.getT5(), 1));
		polinom1.add(new Monom(view.getT6(), 0));

		polinom2.add(new Monom(view.getT7(), 5));
		polinom2.add(new Monom(view.getT8(), 4));
		polinom2.add(new Monom(view.getT9(), 3));
		polinom2.add(new Monom(view.getT10(), 2));
		polinom2.add(new Monom(view.getT11(), 1));
		polinom2.add(new Monom(view.getT12(), 0));
	}

	private void checkError() {
		if (view.getT1() == 0 && view.getT2() == 0 && view.getT3() == 0 && view.getT4() == 0 && view.getT5() == 0
				&& view.getT6() == 0 && view.getT7() == 0 && view.getT8() == 0 && view.getT9() == 0
				&& view.getT10() == 0 && view.getT11() == 0 && view.getT12() == 0) {
			JOptionPane.showMessageDialog(null, "Introduceti datele despre polinoame!!!");
			s = null;
		}
	}
}
