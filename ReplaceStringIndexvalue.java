package week3Day1;

public class ReplaceStringIndexvalue {

	public static void main(String[] args) {
		String sentence="I am working with Java8";
		String replaceDigit = sentence.replaceAll("[\\d]", "11");
		System.out.println("The replaced text is:"+replaceDigit);
		String substring = sentence.substring(5, 14);
		System.out.println("The text from index 5 to 14 is:"+substring);
	}

}
