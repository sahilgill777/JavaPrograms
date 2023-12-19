package constructor;

public class Table {
	String color;
	int price;
	double size;
	Table(String color,int price,double size){
		this.color=color;
		this.price=price;
		this.size=size;
	}
public Table getColor() {
		
		System.out.println("The color of table is " +color);
		return this;
	}
	
	public Table getPrice() {
		
		System.out.println("The price of table is " +price);
		return this;
	}
	
	public Table getSize(){
	
		System.out.println("The size of table is " +size);
		return this;
	}
	
		// TODO Auto-generated method stub

	}


