package org.example.car;
import org.example.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {
	
	@Override
	public void specs() {
		System.out.println("HatchBack From Suzuki!...");
		
	}

}
