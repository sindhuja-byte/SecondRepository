 package Oops1;

public class UseMarker {
	public static void main (String[] args) {
		Refill r =new Refill();
		r.brand="Cello";
		r.price =15;
		r.color="Black";
		
		Marker m =new Marker();
		m.brand="Cartle";
		m.price =50;
		m.color="White";
		m.refill=r;
		
		System.out.println(m.brand+" "+m.color+" "+m.price+" "+m.refill.brand+" "+m.refill.color+" "+m.refill.price);
	
		
	

}
}