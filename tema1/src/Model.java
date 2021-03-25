
public class Model {

	public Polinom adunare(Polinom p1, Polinom p2) {
		Monom rezMonom;
		Polinom rezPolinom = new Polinom();

		for (Monom m1 : p1.getPolinom()) {
			for (Monom m2 : p2.getPolinom()) {
				if (m1.getExponent() == m2.getExponent()) {
					rezMonom = new Monom(m1.getCoeficient() + m2.getCoeficient(), m1.getExponent());
					rezPolinom.add(rezMonom);
				}
			}
		}
		return rezPolinom;
	}

	public Polinom scadere(Polinom p1, Polinom p2) {
		Monom rezMonom;
		Polinom rezPolinom = new Polinom();

		for (Monom m1 : p1.getPolinom()) {
			for (Monom m2 : p2.getPolinom()) {
				if (m1.getExponent() == m2.getExponent()) {
					rezMonom = new Monom(m1.getCoeficient() - m2.getCoeficient(), m1.getExponent());
					rezPolinom.add(rezMonom);
				}
			}
		}
		return rezPolinom;
	}

	public Polinom inmultire(Polinom p1, Polinom p2) {
		Monom rezMonom;
		Polinom rezPolinom = new Polinom();

		for (Monom m1 : p1.getPolinom()) {
			for (Monom m2 : p2.getPolinom()) {
				if (m1.getExponent() == m2.getExponent()) {
					rezMonom = new Monom(m1.getCoeficient() * m2.getCoeficient(), m1.getExponent() + m2.getExponent());
					rezPolinom.add(rezMonom);
				}
			}
		}
		return rezPolinom;
	}

	public Polinom derivare(Polinom p1) {
		Polinom rezPolinom = new Polinom();

		for (Monom m1 : p1.getPolinom()) {
			m1.setCoeficient(m1.getCoeficient() * m1.getExponent());
			m1.setExponent(m1.getExponent() - 1);

			rezPolinom.add(m1);
		}
		return rezPolinom;
	}

	public String afisareRez(Polinom rez) {
		String s = new String();
		for (Monom m : rez.getPolinom()) {
			if (m.getCoeficient() != 0) {
				if (m.getExponent() != 0) {
					if (m.getCoeficient() > 0) {
						s += " + " + m.getCoeficient() + "X^" + m.getExponent();
					} else {
						s += " + ( " + m.getCoeficient() + " )" + "X^" + m.getExponent();
					}
				} else {
					if (m.getCoeficient() > 0) {
						s += " + " + m.getCoeficient();
					} else {
						s += " + ( " + m.getCoeficient() + " )";
					}
				}
			}
		}
		s += " = 0";
		return s;
	}

}
