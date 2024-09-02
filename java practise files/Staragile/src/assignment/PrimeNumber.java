package assignment;

public class PrimeNumber {

	public static void main(String[] args) {
     int num=100;
     
     System.out.println("The prime numbers between 1 and 100 are :");
     for(int i = 2; i < num; i++) 
     {
    	 boolean isPrime = true;
    	 for(int j = 2; j <= i/2; j++)
    	 {
    		   if(i%j == 0) 
                 {
                   isPrime = false;
                   break;
                 }
               
         }
         if(isPrime) {
                 System.out.println(i);
         }
 }
}
}
