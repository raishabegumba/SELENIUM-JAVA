package stringdemo;

public class StringMethod {

	public static void main(String[] args) {
		
		String name= "Raisha Begum B A";
		
		System.out.println("==========================");
		System.out.println("string length demo");
		//string length method
		int strLength = name.length();
		System.out.println("the length of the string is :" + strLength);
		
		System.out.println("==========================");
		System.out.println("string lowercase demo");
		
		//lowercase
		System.out.println("lower case is " +name.toLowerCase());
		
		System.out.println("==========================");
		System.out.println("string UPPERCASE demo");
		//uppercase
		System.out.println("upper case is " +name.toUpperCase());
		
		System.out.println("==========================");
		//trim - remove leading and trailing space and return string
		System.out.println(" STRING TRIM DEMO");
		String nonTrimmedString= "            Raisha Begum         ";
		System.out.println(nonTrimmedString);//without removing space
		System.out.println(nonTrimmedString.trim());
		
		System.out.println("==========================");
		//sub string with start index
		System.out.println("SUB STRING DEMO with start index");
		System.out.println(name.substring(2));
		
		System.out.println("==========================");
		//sub string with start index and exclude end index
		System.out.println("SUB STRING DEMO with start and end index");
		System.out.println(name.substring(2,7));
		
		System.out.println("==========================");
		//String concatenation
		System.out.println("String Concatenation");
		String name1= "Zaeem";
		String name2= "Zahan";
		String name3="";
		String samename="ZAEEM";
		
		System.out.println("==========================");
		//equals- acts like comparision operator ==
		System.out.println("check samename and name1 are same considering case "+ name1.equals(samename));//COMPARES WITH cases as well
		
		System.out.println("==========================");
		//compares ignoring case
		System.out.println("check samename and name1 are same ignoring case " +name1.equalsIgnoreCase(samename));
		
		
		System.out.println("Concatenated string is :" + name1.concat(name2));
		
		System.out.println("==========================");
		//String is empty
		System.out.println("is name1 is empty ? " +name1.isEmpty());
		System.out.println("is name3 is empty ? " +name3.isEmpty());
		
		System.out.println("==========================");
		//String contains
		System.out.println("does name1 contains z: " +name1.contains("z"));//upper case z ia not present
		System.out.println("does name1 contains z: " +name1.contains("a"));
		
		System.out.println("==========================");
		//string comparision ignoring case
		System.out.println("Is Zaeem== ZAEEM by ignoring case: " +name1.equalsIgnoreCase("ZAEEM"));
		
		System.out.println("==========================");
		//string indexOf
		System.out.println("The index of Z in Zaeem is :" + name1.indexOf('Z'));
		System.out.println("The index of a in Zaeem is :" + name1.indexOf('a'));
		System.out.println("The index of e in Zaeem is :" + name1.indexOf('e'));//always evaluates first occurrence of e
		System.out.println("The index of e in Zaeem is :" + name1.indexOf('e'));
		System.out.println("The index of m in Zaeem is :" + name1.indexOf('m'));
		
		System.out.println("==========================");
		String modifiedName="Zaeemaeem";
		System.out.println("the index of eem in string Zaeemaeem: " +modifiedName.indexOf("eem"));
		System.out.println("index of wrong character in string Zaeemaeem :" +modifiedName.indexOf("uu"));
		System.out.println("==========================");
		//String index of last occurance of character in the given string
		System.out.println("The last index of e in Zaeem is :" + name1.lastIndexOf('e'));
		System.out.println(name1.lastIndexOf("ae"));
		System.out.println("The last index of wrong character in String Zaeem is :" + name1.lastIndexOf('0'));
		
		System.out.println("==========================");
		//string replace'
		System.out.println("Replace of e with E in Zaeem:  " + name1.replace('e', 'E'));
		System.out.println("Replace of Zaeem with ahmed :  "+ name1.replace("Zaeem", "Ahmed"));
        System.out.println(name1);//the value will be replacec until above replace value is stored in same string variable
	  //  System.out.println(name1.replaceAll(name2, name3));
	   
    	System.out.println("==========================");
	    //charAt
	    System.out.println("the character at index 3 in string Zaeem is "+name1.charAt(2));
	
		System.out.println("==========================");
	  
		System.out.println("==========================");
	    //startswith
	    
	    String name4= "i love java and selenium";
	    
	    System.out.println("does name starts with i: " +name4.startsWith("i"));
	    System.out.println("does name starts with i love: " +name4.startsWith("i love"));
	    System.out.println("does name starts with j: " +name4.startsWith("j"));
	   
		System.out.println("==========================");
	   //endswith
	    System.out.println(" does name4 ends with nium "+name4.endsWith("nium"));
	    System.out.println(" does name4 ends with java "+name4.endsWith("java"));
	    //String endswith
	    System.out.println("does ths string Zaeem ends with 'm': " +name1.endsWith("m"));
	    
	    System.out.println("==========================");
	    //compareTo
	    System.out.println(name4.compareTo(name1));//unicode comparision
	    System.out.println("DA".compareTo("CA"));//D-C= 67-66 =1  AND A-A =65-65=0
	    
	    System.out.println("==========================");
	    //String split
	    String spiltString1[]=name4.split(" ");
	    for(int i=0; i <spiltString1.length; i++)
	    {
	    	System.out.println(spiltString1[i]);
	    }
	    
	    System.out.println("==========================");
	    String name5="Malayalam";
	    String spiltString2[]=name5.split("a");//string used to split string will be omitted and will  be stored in string array
	    for(int i=0; i <spiltString2.length; i++)
	    {
	    	System.out.println(spiltString2[i]);
	    }
	}

}
