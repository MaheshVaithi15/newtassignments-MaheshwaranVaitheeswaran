
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.interfaces.Car;

class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mycar = context.getBean("corolla",Car.class);
		mycar.specs();
		context.close();
		
		
		

	}

}
