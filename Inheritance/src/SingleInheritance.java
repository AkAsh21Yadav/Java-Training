
class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
public class SingleInheritance extends Animal
{
	@Override
	void eat()
	{
		System.out.println("Eating peacefully...");
	}
	
	public static void main(String[] args) 
	{
		SingleInheritance s = new SingleInheritance();
		s.eat();
	}
}
