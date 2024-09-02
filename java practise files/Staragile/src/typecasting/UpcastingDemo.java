package typecasting;

class Animal
{
    String color; 
  void eat()
 {
	  System.out.println("eating");
 }
  void sleep()
  {
	  System.out.println("sleeping");
  }
  
  void sound()
  {
	  System.out.println("sound of an animal");
  }
}

class Dog extends Animal
{
	//overriden method 
	void sound()
	  {
		  System.out.println("sound of an dog is bow-bow");
	  }
	void bark()
	{
		System.out.println("barking");
	}
	void wagtail()
	{
		System.out.println("wagging tail");
	}
}
class Demo
{
public static void main(String args[])
{
Dog d1=new Dog(); //creation of dog object
d1.sleep();
d1.eat();
d1.bark();
d1.wagtail();

//upcasting Dog to Animal
Animal a1=new Dog();// up-casting
//parents members
a1.sleep();
a1.eat();
a1.color="brown";
System.out.println("the color og dos is "+ a1.color);

//overriden method
a1.sound();

//after up-casting, it cannot access its own methods.
//a1.bark();
//a1.wagtail();
}
}


