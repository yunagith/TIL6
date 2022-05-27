package ch11_api_class.sec07;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// ���Խİ� Pattern Ŭ���� ����
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// 02 �Ǵ� 010 - ���� 3~4�� - ���� 4��
		//String data = "010-123-4567";
		String data = "02-1234-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		// Ư�� ���� : \n, \t, \\ (���������� Ư������)
		// @�� Ư������ �ƴ�
		regExp ="\\w+@\\w+\\.\\w+(\\..\\w+)?";
		data = "angel@naver.com";	// angel@naver.co.kr
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}

}
