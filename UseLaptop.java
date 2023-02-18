package Oops1;

public class UseLaptop {
	public static void main(String[] args) {
		Battery b=new Battery(50,50000);
		Laptop l=new Laptop("Dell",500000,"Black","XVL",true,b);
		System.out.println(l);
	}

}
