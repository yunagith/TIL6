package ch11_api_class.sec06;

public class StringReplaceEx {

	public static void main(String[] args) {
		// replace() 예제
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
