package week3;

public class Students {

	public void getStudentInfo()
	{
		int id=2023;
	
		System.out.println("Year " +  id);
	}
	public void getStudentInfo(int id, String name)
	{
		
		System.out.println("Student ID " +  id);
		System.out.println("Student Name " + name);
	}
	public void getStudentInfo(String email, int phone)
	{
		
		System.out.println("E-mail is " +  email);
		System.out.println("Phone number " + phone);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students a=new Students();
		a.getStudentInfo();
		a.getStudentInfo(123, "Priya");
		a.getStudentInfo("abc@gmail.com", 123456789);
	}

}
