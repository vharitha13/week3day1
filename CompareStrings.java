package week3Day1;

public class CompareStrings {

	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am learning java";
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("The result of equalsIgnoreCase is:"+equalsIgnoreCase);
		boolean equals = str1.equals(str2);
		System.out.println("The result of equals is:"+equals);
		if(str1==str2) {
			System.out.println("String text is equal");
		}
		else {
			System.out.println("String text is not equal");
		}
	}

}
