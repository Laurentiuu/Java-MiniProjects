
public class Client {
	private int id;
	private int tArrival;
	private int tService;
	private int tWait;
	
	private boolean status;
	
	public Client(int id,int tArrival, int tService)
	{
		this.id=id;
		this.tArrival=tArrival;
		this.tService=tService;
		this.tWait=tArrival;
		this.status=true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int gettArrival() {
		return tArrival;
	}

	public void settArrival(int tArrival) {
		this.tArrival = tArrival;
	}

	public int gettService() {
		return tService;
	}

	public void settService(int tService) {
		this.tService = tService;
	}

	public int gettWait() {
		return tWait;
	}

	public void settWait(int tWait) {
		this.tWait = tWait;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
