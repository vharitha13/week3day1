package week3Day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Printing ID:"+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Printing ID:"+id);
		System.out.println("Printing name:"+name);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Printing email:"+email);
		System.out.println("Printing Phone Number:"+phoneNumber);
	}

	public static void main(String[] args) {
		Students studs=new Students();
		studs.getStudentInfo(103);
		studs.getStudentInfo(103, "haritha");
		studs.getStudentInfo("vharitha1310@gmail.com", 8939096913L);
	}

}
