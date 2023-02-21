package week5.assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("STUDENT ID: "+id);
	}
	public void getStudentInfo(String Name) {
		System.out.println("STUDENT NAME: "+Name);
	}
	public void getStudentInfo(char Email) {
		System.out.println("STUDENT EMAIL: "+Email);
	}
	public void getStudentInfo(long phonenumber) {
		System.out.println("STUDENT PHONENO: "+phonenumber);
	}
	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo(110);
		details.getStudentInfo("Riya");
		details.getStudentInfo("abcde@gmail.com");
		details.getStudentInfo(9876543210L);
			
		
	}

}
