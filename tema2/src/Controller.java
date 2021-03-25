import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Controller {

	ReadFromFile r;

	private Client[] clients;
	private Queue queues[];

	private int n;
	private int q;
	private int maxTime;

	private double avg;

	PrintWriter txt;

	public Controller(String in, String out) {
		r = new ReadFromFile(in);
		this.n = r.getN();
		this.q = r.getQ();
		this.maxTime = r.gettMaxSimulation();
		try {
			this.txt = new PrintWriter(out);
		} catch (FileNotFoundException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		} 
		initalizeClients();
		initalizeQueues();
		createClients();
		calculateAvg();
		start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initalizeClients() {
		clients = new Client[n];// aloc memorie
		for (int i = 0; i < this.n; i++) {
			clients[i] = new Client(0, 0, 0);
		}
	}

	private void initalizeQueues() {
		queues = new Queue[q];// aloc memorie
		for (int i = 0; i < this.q; i++) {
			queues[i] = new Queue(new String("Queue " + i));
			queues[i].start();
		}
	}

	private int getRandomNumber(int min, int max) {
		if (min >= max) {
			txt.println("Nu s-au introdus bine datele");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	private void createClients() {
		int id = 1;
		for (int i = 0; i < this.n; i++) {
			clients[i].setId(id);
			clients[i].settArrival(getRandomNumber(r.gettMinArrival(), r.gettMaxArrival()));
			clients[i].settService(getRandomNumber(r.gettMinServicel(), r.gettMaxService()));
			clients[i].settWait(clients[i].gettArrival());
			id++;
		}
	}

	private void calculateAvg() {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += clients[i].gettService();
		}
		this.avg = sum / n;
	}

	private void printLine() {

		for (int i = 0; i < n; i++) {
			int wait = clients[i].gettWait();
			if (clients[i].gettWait() == 0) {
				int r = getRandomNumber(0, q - 1);
				queues[r].add(clients[i]);
				queues[r].setStatus(true);
				clients[i].settWait(wait - 1);
			} else if (clients[i].gettWait() > 0) {
				txt.print("(" + clients[i].getId() + "," + clients[i].gettArrival() + "," + clients[i].gettService()
						+ "); ");
				clients[i].settWait(wait - 1);
			} else {
				continue;
			}
		}

		txt.println();
		for (int i = 0; i < q; i++) {
			if (queues[i].getQueue().isEmpty()) {
				txt.println("Queue " + i + ": closed");
			} else {
				txt.print("Queue " + i + ": ");
				for (Client j : queues[i].getQueue()) {
					if (j.gettService() > 0 && j.gettWait() < 0 && j.isStatus() == true) {
						txt.print("(" + j.getId() + "," + j.gettArrival() + "," + j.gettService() + "); ");
						j.settService(j.gettService() - 1);
						queues[i].setStatus(false);
					} else if (j.gettService() == 0) {
						j.setStatus(false);
						j.settService(j.gettService() - 1);
					}
				}
				txt.print("\n");
			}
		}

	}

	private void start() {

		for (int seconds = 0; seconds < maxTime; seconds++) {
			txt.println();
			txt.println("Time " + seconds);
			txt.print("Waiting clients: ");

			printLine();

		}
		txt.println();
		txt.println("Average waiting time: " + avg);
	}
}
