
class Animal 
{
	void eat()
	{
		System.out.println("Eating is in progress...");
	}
}

class Dog extends Animal
{ }

class Cat extends Animal
{
	@Override
	void eat()
	{
		System.out.println("Meow is in progress...");
	}
}

public class TestAnimal
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		Cat c = new Cat();
		Animal a= new Animal();
		
		d.eat();
		c.eat();
		a.eat();
	}
}