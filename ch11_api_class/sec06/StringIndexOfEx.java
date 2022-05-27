package ch11_api_class.sec06;

public class StringIndexOfEx {

	public static void main(String[] args) {
		// indexOf() 예제
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바")==-1) {// 못 찾은 경우 (포함되어 있지 않은 경우)
			System.out.println("자바와 관련이 없는 책이군요");
		}else {
			System.out.println("자바와 관련된 책이군요");
		}
		
		String email = "abc@abc.com";
		if(email.indexOf("@")==-1) {// 못 찾은 경우 (포함되어 있지 않은 경우)
			System.out.println("이메일 형식이 아닙니다.");
		}else {
			System.out.println("이메일 형식이 맞습니다.");
		}
	}

}
