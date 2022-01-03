package bridgelabz.employeewageproblem;

public class DailyEmpWage {
	public static boolean attendance() {
		int is_Present = 1;
		int emp_check=(int)(Math.floor(Math.random()* 10) % 2);
		if (emp_check==is_Present) 
			return true;  	
			else 
			   return false;
	}
	public static int dailywage() {
		boolean result = attendance();
		DailyEmpWage obj1 = new DailyEmpWage();
		obj1.attendance();
		int  daily_wage;
		int wage_pr_hr=20;
	    int working_hour;
		
		if (result)
		{
			System.out.println("Employee is Present");
			working_hour=8;
		} 
		else
		{
			System.out.println("Employee is Absent");
	        working_hour=0;
		}
		daily_wage=working_hour * wage_pr_hr;
		return daily_wage;
	}
	public static void main(String[] args) {
		int result = dailywage();
	
	System.out.println("Employee daily wage is " + result);
 }
}