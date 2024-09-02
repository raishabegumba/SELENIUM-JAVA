package typecasting;

class Animal1
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

class Dog1 extends Animal1
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


public class DowncastDemo {

	public static void main(String[] args) {
	
        //to perform downcasting, first we need upcast the object
		//upcasting Dog to Animal
		Animal1 a1=new Dog1();// up-casting
		Dog1 a2=(Dog1)a1;//downcasting upcasted object
		
		//parent class properties
		a2.color="white";
		
		a2.eat();
		a2.sleep();
		//child class properties
		a2.sound();
		a2.bark();
		a2.wagtail();
		

	}

}
