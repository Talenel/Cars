
public class CarApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("blue", "Mazda", "Mazda3");
		Car car2= new Car("gold","Honda", "Odyssey");
		
		System.out.println(car1.start());
		System.out.println(car2.accelerate(20));
		System.out.println(car2.start());
		System.out.println(car1.accelerate(25));
		System.out.println(car2.accelerate(40));
		System.out.println(car1.brake(30));
		System.out.println(car1.accelerate(30));
		System.out.println(car2.brake(30));
		System.out.println(car1.brake(0));
		System.out.println(car2.brake(0));
		
		

	}

}
