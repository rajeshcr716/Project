package Abstract_class_details;

import java.lang.*;

abstract class vechile{
	public abstract int getNoOfWheels();
}

class Bus extends vechile{

	@Override
	public int getNoOfWheels() {
		return 6;
	}
		
}

class Auto extends vechile{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}

public class extendAbstractClass_3{
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println("No of Wheels in Bus: "+b.getNoOfWheels());
		
		Auto a = new Auto();
		System.out.println("No of Wheels in Auto: "+a.getNoOfWheels());
	}
}




