package ch11_api_class.sec07;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// 정규식과 Pattern 클래스 예제
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// 02 또는 010 - 숫자 3~4개 - 숫자 4개
		//String data = "010-123-4567";
		String data = "02-1234-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 특수 문자 : \n, \t, \\ (역슬래시의 특수문자)
		// @는 특수문자 아님
		regExp ="\\w+@\\w+\\.\\w+(\\..\\w+)?";
		data = "angel@naver.com";	// angel@naver.co.kr
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
