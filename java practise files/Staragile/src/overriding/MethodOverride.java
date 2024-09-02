package overriding;

class Animal{
	void speak()
	{
		System.out.println("Animal Speaking");
	}
}
class Mammal extends Animal{
	void speak()
	{
		System.out.println("Mammal Speaking");
	}
}
class Dog extends Mammal{
	void speak()
	{
		System.out.println("BOW BOW");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		Mammal m1=new Mammal();
		m1.speak();
		Animal a1=new Animal();
		a1.speak();
		Dog d1=new Dog();
		d1.speak();

		

	}

}
