package day8;

public class CustomException {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		
		try
		{
			
			service.checkcity("101001022");
			service.checkcity("101001052");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
}