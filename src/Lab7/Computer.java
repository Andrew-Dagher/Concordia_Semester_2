package Lab7;

public class Computer {
	
	private String CPU;
	private int RAM;
	private int storage;
	
	
	
	public Computer(String cPU, int rAM, int storage) {
		super();
		CPU = cPU;
		RAM = rAM;
		this.storage = storage;
	}



	public String getCPU() {
		return CPU;
	}



	public void setCPU(String cPU) {
		CPU = cPU;
	}



	public int getRAM() {
		return RAM;
	}



	public void setRAM(int rAM) {
		RAM = rAM;
	}



	public int getStorage() {
		return storage;
	}



	public void setStorage(int storage) {
		this.storage = storage;
	}



	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + "]";
	}
	

}
