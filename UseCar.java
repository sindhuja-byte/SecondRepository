package Oops1;

public class UseCar {
	public static void main(String[] args) {
		
		Engine e =new Engine();
		e.setBrand("Durable");		
		e.setPrice(6500);		
		e.setModel("XVI");
		
				
		Car c =new Car();
		c.setBrand("AUDI");
		c.setPrice(500000);
		c.setColor("BLACK");
		c.setEngine(e);
		
		
		System.out.println(c.getBrand()+" "+c.getPrice()+" "+c.getColor()+" "+c.getEngine().getBrand()+" "+c.getEngine().getPrice()+" "+c.getEngine().getModel());
		
		
		
	}

}
