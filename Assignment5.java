package week3Day1;

public class Assignment5 {

	public static void main(String[] args) {
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");

	}

}
//== operator compares the reference points to check if it is pointing to the same location or not and will not compare the content.
//In this case, since 2 new string operations are created 2 new memory locations will be created 
//and hence the == operation has provided 'diff text'
