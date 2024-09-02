package encapsulation;

class UserInfo
{
	private int age_User;
	private String name_User;
	
	//read only
	public int getAge_User() {
		return age_User;
	}
	
	//write only
	public void setAge_User(int age) {
		this.age_User = age;
	}
	public String getName_User() {
		return name_User;
	}
	public void setName_User(String name) {
		this.name_User = name;
	}
}



public class EncapsulationdDemo {

		public static void main(String[] args) {
		
		System.out.println("printing the encapsulated variables/data through getter and setter");
		UserInfo user1= new UserInfo();
		user1.setAge_User(33);
		user1.setName_User("Raisha");
		System.out.println("The age of user is " +user1.getAge_User());
		System.out.println("The name of user is " +user1.getName_User());
				
		System.out.println("=========================");
		UserInfo user2= new UserInfo();
		user2.setAge_User(38);
		user2.setName_User("Jabbar");
		System.out.println("The age of user is " +user2.getAge_User());
		System.out.println("The name of user is " +user2.getName_User());
     
	}

}
