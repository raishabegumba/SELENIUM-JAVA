package startagilepackage;

public class BreakContinueDemo {

	public static void main(String[] args) {

   //print 1..7
		for(int i=1;i<=10;i++)
  {
	  if(i==7)
	  {
		  break;
	  }
	  System.out.println(i);
  }
  
  //print except 7
  for(int i1=1;i1<=10;i1++)
  {
	  if(i1==7)
	  {
		  continue;// skip printing 7
	  }
	  System.out.println(i1);
  }

  //print 1to 10 except 3,5 7
  for(int i1=1;i1<=10;i1++)
  {
	  if(i1==3 || i1==5 || i1==7)
	  {
		  continue;// skip printing 3,5,7
	  }
	  System.out.println(i1);
  }
  
  

	}

}
