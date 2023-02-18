package Oops1;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private String model;
	private boolean isWarrenty;
	private Battery battery;
	
	public Laptop(String brand,int price,String color,String model,boolean isWarrenty,Battery battery) {
		this.brand=brand;		
		this.price=price;
		this.color=color;
		this.model=model;
		this.isWarrenty=isWarrenty;
		this.battery =battery;
		
	}
	public void setBrand(String brand) {
		this.brand=brand;
		}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
		}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
		}
	public String getColor() {
		return brand;
	}
	public void setModel(String model) {
		this.model=model;
		}
	public String getModel() {
		return model;
	}
	public void setIsWarrenty(boolean isWarrenty) {
		this.isWarrenty=isWarrenty;
		}
	public boolean getIsWareenty() {
		return isWarrenty;
	}
	public void setBattery(Battery battery) {
		this.battery=battery;
		}
	public Battery getBattery() {
		return battery;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+model+" "+isWarrenty+" "+battery;
	}
	

}
