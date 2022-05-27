package ch11_api_class.sec06;

public class StringTrimEx {

	public static void main(String[] args) {
		// trim() ¿¹Á¦
		String tel1 = "   02";
		String tel2 = "123";
		String tel3 = "   1234   ";
		
		String tel =tel1.trim() + tel2.trim()+tel3.trim();
		System.out.println(tel);

	}

}
