package ch11_api_class.sec06;

public class StringCharAtEx {

	public static void main(String[] args) {
		// charAt() 메소드 예제
		String ssn = "010203-1234123";
		
		// 성별 확인해서 출력
		// Switch 문 사용
		// 남자입니다
		
		char charValue = ssn.charAt(7);
		
		switch(charValue) {
		case '1':System.out.println("남자입니다."); break;
		case '2':System.out.println("여자입니다."); break;
		case '3':System.out.println("남자입니다."); break;
		case '4':System.out.println("여자입니다."); break;
	    default: System.out.println("잘못 입력하였습니다.");
		
		}

	}

}
