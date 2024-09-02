package startagilepackage;

public class BitwiseDemo {

	public static void main(String[] args) {

   int x=5;
             // 5    3
   //2^0 = 1    1    1
   //2^1 = 2    0    1
   //2^2 = 4    1    0
   //2^3 = 8    0    0
    
   x&=3;
   System.out.println(x);

	}

}
 class BitwiseDemo1 {

	public static void main(String[] args) {

   int x=5;
             // 5    3
   //2^0 = 1    1    1
   //2^1 = 2    0    1
   //2^2 = 4    1    0
   //2^3 = 8    0    0
    
   x|=3;
   System.out.println(x);

	}

}
