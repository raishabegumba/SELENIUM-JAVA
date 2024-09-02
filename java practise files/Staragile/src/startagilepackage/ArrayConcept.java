package startagilepackage;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// java array is the collection of similar data type
		//declaration ways of 3 type
		
		//type 1: datatype arrayname[]; 
		//type 2: datatype [] arrayname; 
		//type3 : datatype[] arr[]
		// declaration syntax datatype [] name= new datatype[size]
		
		String days[]= new String[7];
		days[0]="Sunday";
		days[1]="Monday";
		days[2]= "Tuesday";
		days[3]="wednesday";
		days[4]= "Thursday";
		days[5]="Friday";
		days[6]="Saturday";
	    for (int i=0;i<days.length; i++)
	    {
	    	System.out.println(days[i]);
	    }
	    
	    System.out.println("print string array value using foreach loop===");
	    for(String a:days)
	    {
	      System.out.println(a);
	    }
	    
	    System.out.println("print int array value using foreach loop===");
	    int num[]= {1,2,3,4,5,6};
	    for(int i:num)
	    {
	      System.out.println(i);
	    }

	}

}
