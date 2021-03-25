import java.util.ArrayList;

public class Queue extends Thread {

	private boolean status;
	ArrayList<Client> queue = new ArrayList<Client>();

	private Thread t;
	private String name;

	public Queue(String name) {
		this.status = true;
		this.name = name;
	}

	public void run() {
		System.out.println("Running " +  name );
		for (Client i : queue) {
			i.settService(i.gettService() - 1);
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}

	public void add(Client c) {
		this.queue.add(c);
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArrayList<Client> getQueue() {
		return queue;
	}


	public void setT(Thread t) {
		this.t = t;
	}

	
	
	
}
