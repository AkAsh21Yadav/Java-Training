class Vegetable
{
	private int price;

	int getPrice()
	{
		return price;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	void display()
	{
		System.out.println("This is Setters & Getters in Encapsulation...");
	}
}
class Tomato extends Vegetable
{
	@Override
	void display()
	{
		System.out.println("This is the Method Overriding in Encapsulation...");
	}
}
public class InheritanceinEncapsulation1 
{
	public static void main(String[] args) 
	{
		Tomato t = new Tomato();
		t.setPrice(35);
		t.display();
		
		Vegetable v1 = new Vegetable();
		v1.setPrice(85);
		v1.display();
		
		System.out.println("Price 1 : "+v1.getPrice()+"\nPrice 2 :"+t.getPrice());
	}
}
