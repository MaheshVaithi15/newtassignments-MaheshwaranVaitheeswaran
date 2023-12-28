package org.example.car;

import org.example.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {
	
	//Engine engine = new Engine();
	
	@Autowired(required=false)
	Engine engine;
	
	
	
	public Corolla(Engine engine) {
		engine.type="V6";
		//this.engine = engine;
	}



	@Override
	public void specs() {
		System.out.println("Sedan from Toyoto!... With Engine Type as "+engine.type);
	}

}
