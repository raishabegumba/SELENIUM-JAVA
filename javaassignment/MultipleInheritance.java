package javaassignment;

interface PhoneHardware
{
	abstract void display();
	abstract void earphone();
	abstract void battery();
	abstract void charger();
	abstract void speaker();
	
}

interface PhoneSoftware
{
	abstract void calculator();
	abstract void calender();
	abstract void call();
	abstract void touchLockScreen();
	
}


class iPhone implements PhoneHardware,PhoneSoftware
{
	
	 public void display()
	 {
		 System.out.println("This is iphone display feature");
	 }
	 public void earphone()
	 {
		 System.out.println("This is iphone earphone feature");
	 }
	 public void battery()
	 {
		 System.out.println("This is iphone battery feature");
	 }
	 public void charger(){
		 System.out.println("This is iphone charger feature");
	 }
	 public void calculator(){
		 System.out.println("This is iphone calculator feature");
	 }
	 public void calender(){
		 System.out.println("This is iphone calender feature");
	 }
	 public void call(){
		 System.out.println("This is iphone call feature");
	 }
	 public void touchLockScreen(){
		 System.out.println("This is iphone touchLockScreen feature");
	 }
	 public void speaker(){
		 System.out.println("This is iphone speaker feature");
	 }
	 public void siri(){
		 System.out.println("This is iphone siri feature");
	 }

}

class Android implements PhoneHardware,PhoneSoftware
{
	
	 public void display()
	 {
		 System.out.println("This is android display feature");
	 }
	 public void earphone()
	 {
		 System.out.println("This is android earphone feature");
	 }
	 public void battery()
	 {
		 System.out.println("This is android battery feature");
	 }
	 public void charger(){
		 System.out.println("This is android charger feature");
	 }
	 public void calculator(){
		 System.out.println("This is android calculator feature");
	 }
	 public void calender(){
		 System.out.println("This is android calender feature");
	 }
	 public void call(){
		 System.out.println("This is android call feature");
	 }
	 public void touchLockScreen(){
		 System.out.println("This is android touchLockScreen feature");
	 }
	 public void speaker(){
		 System.out.println("This is android speaker feature");
	 }
	 public void googleAssistant(){
		 System.out.println("This is android googleAssistant feature");
	 }

}

public class MultipleInheritance {

	public static void main(String[] args) {
        //iphone object
		iPhone iDevice= new iPhone();
		//invoke iphone methods
		iDevice.display();			
		iDevice.earphone();
		iDevice.battery();
		iDevice.charger();
		iDevice.speaker();
		iDevice.calculator();
		iDevice.calender();
		iDevice.call();
		iDevice.touchLockScreen();
		iDevice.siri();
		System.out.println("===================");
		
		//android object
		Android aDevice = new Android();
		//invoke android methods
		aDevice.display();			
		aDevice.earphone();
		aDevice.battery();
		aDevice.charger();
		aDevice.speaker();
		aDevice.calculator();
		aDevice.calender();
		aDevice.call();
		aDevice.touchLockScreen();
		aDevice.googleAssistant();
		
		

	}

}
