package startagilepackage;

public class LeapYear {

	public static void main(String[] args) {
		
		
		int year1=2000;
		boolean leap_year= true;
		System.out.println("    ...................leap year using logical operations.............");
		if((year1%4==0 && year1%100==0)  || (year1%400==0))
		{
				leap_year=true;
				System.out.println("the year is leap year "+ leap_year);
						
		}
		else
		{
			leap_year=false;
			System.out.println("the year is not leap year "+ false);
		}
		System.out.println(" ......................leap year using if else statements ......................");
		int year2=2000;
		if(year2%4==0)
		{
				leap_year=true;
				if (year2%100==0 || year2%400==0)
				{
				System.out.println("the year is leap year  "+ leap_year);
				}
						
		}
		else
		{
			System.out.println(" the year is not leap year");
		}
		

}
}
