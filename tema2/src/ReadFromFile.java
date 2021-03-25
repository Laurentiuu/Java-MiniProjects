import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	private int n;
	private int q;
	private int tMaxSimulation;
	private int tMinArrival;
	private int tMaxArrival;
	private int tMinServicel;
	private int tMaxService;

	public ReadFromFile(String input) {
		System.out.println("\n"+input + "\n");
		File f = new File(input);

		String path = new String();
		if (f.exists()) {
			path = f.getAbsolutePath();
			System.out.println(path);
		}

		int[] fileData = new int[7];
		File file = new File(path);
		Scanner sc;
		try {
			int count = 0;
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String a = sc.nextLine();
				if (a.length() > 2 && a.charAt(1) == ',') {
					fileData[count] = Integer.parseInt(a.substring(0, 1));
					count++;
					fileData[count] = Integer.parseInt(a.substring(2, a.length()));
					count++;
				} else if (a.length() > 2 && a.charAt(2) == ',') {
					fileData[count] = Integer.parseInt(a.substring(0, 2));
					count++;
					fileData[count] = Integer.parseInt(a.substring(3, a.length()));
					count++;
				} else {
					fileData[count] = Integer.parseInt(a);
					count++;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Nu s-au intodus date potrivite");
		} catch (FileNotFoundException e) {
			System.out.println("Nu s-a gasit fisierul");
		}
		this.n = fileData[0];
		this.q = fileData[1];
		this.tMaxSimulation = fileData[2];
		this.tMinArrival = fileData[3];
		this.tMaxArrival = fileData[4];
		this.tMinServicel = fileData[5];
		this.tMaxService = fileData[6];
	}

	public int getN() {
		return n;
	}

	public int getQ() {
		return q;
	}

	public int gettMaxSimulation() {
		return tMaxSimulation;
	}

	public int gettMinArrival() {
		return tMinArrival;
	}

	public int gettMaxArrival() {
		return tMaxArrival;
	}

	public int gettMinServicel() {
		return tMinServicel;
	}

	public int gettMaxService() {
		return tMaxService;
	}

}