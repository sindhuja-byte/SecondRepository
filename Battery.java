package Oops1;

public class Battery {

	private int capacity;
	private int a;
		
	public Battery(int capacity,int price) {
		this.capacity=capacity;		
		this.a=price;				
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
		}
	public int getCapacity() {
		return capacity;
	}
	public void setPrice(int price) {
		this.a=price;
		}
	public int getPrice() {
		return a;
	}
	
	public String toString() {
		return capacity+" "+a;
	}
	



}
