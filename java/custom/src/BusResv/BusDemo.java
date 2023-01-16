package BusResv;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    
	
	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,39));
		buses.add(new Bus(3,true,36));
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
		
		for(Bus b:buses) {
			b.dislayBusInformation();
		}
		
		
		Scanner sc=new Scanner(System.in);
		int userOption=1;
		while(userOption==1) {
			System.out.println("enter 1 to book and 2 to exit the page");
		userOption=sc.nextInt();
		if(userOption==1) {
//			System.out.println("booking.......");
			Booking bb=new Booking();
			if(bb.isAvailable(bookings,buses)) {
				bookings.add(bb);
				System.out.println("your booking is confirm");
				
			}
			else
				System.out.println("sorry full");
		}
		}
	}

}
