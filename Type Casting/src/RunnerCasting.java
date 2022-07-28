class Animal
{
	
}

class Dog extends Animal
{

}

public class RunnerCasting 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		Animal a = d;	//upcasting
		Object o = a;
		
		System.out.println("Upcasting : " +o);
	}
}
