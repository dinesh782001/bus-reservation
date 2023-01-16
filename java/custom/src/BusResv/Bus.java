package BusResv;

public class Bus {

	
	 private int bus_no;
	 private boolean ac;
	 private int capacity;
	Bus(int no,boolean ac,int cap){
		this.bus_no=no;
		this.ac=ac;
		this.capacity=cap;
		
		
	}
	public int getBusNumber() {
		return bus_no;
	}
	public void setBusNumber(int no) {
		bus_no=no;
	}
	public int getCapacity(){//accessor method
		return capacity;
	}
	public void setCapacity(int cap) {//mutator method
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
		
	}
	public void setAc(boolean val) {
		ac=val;
		
	}
	
	public void dislayBusInformation() {
		System.out.println("bus no;"+bus_no +"ac: "+ ac+"total capacity" +capacity);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
