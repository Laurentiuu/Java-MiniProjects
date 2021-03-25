import java.util.ArrayList;

public class Polinom {
	private ArrayList<Monom> polinom = new ArrayList<Monom>();

	public void add(Monom m) {
		polinom.add(m);
	}

	public ArrayList<Monom> getPolinom() {
		return polinom;
	}

	public static void cleanPolinom(Polinom p) {
		p.polinom.clear();
	}
	
}
