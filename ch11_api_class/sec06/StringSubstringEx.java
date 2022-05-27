package ch11_api_class.sec06;

public class StringSubstringEx {

	public static void main(String[] args) {
		// substring() ¿¹Á¦
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		String secongNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secongNum);
		

	}

}
