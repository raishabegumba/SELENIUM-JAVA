package array;

public class TwoDimesionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float array[][]= {{1.1f,2.2f},{3.3f,4.4f},{5.5f,6.6f}};
        for(float a1[]:array)
        {
        	for(float a:a1)
        	{
        		System.out.print(a);
        		System.out.print(" ");
        	}
        	System.out.println();
        }
        
	}

}
