package BusResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
String passenger_name;
int bus_no;
Date date;

Booking(){
	Scanner sc=new Scanner(System.in);
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	
	System.out.println("enter the name of the passenger : ");
	passenger_name=sc.next();
	System.out.println("enter the busno ");
	bus_no=sc.nextInt();
	System.out.println("enter the date");
	String dateInput=sc.next();
	try {
		date=sdf.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
	int capacity=0;
	for(Bus bus:buses) {
		if(bus.getBusNumber() == bus_no)
			capacity=bus.getCapacity();
	}
	int booked=0;
	for(Booking b:bookings) {
		if(b.bus_no == bus_no && b.date.equals(date)) {
			booked++;
		}
	}
	return  booked<capacity?true:false;
	
}





}
