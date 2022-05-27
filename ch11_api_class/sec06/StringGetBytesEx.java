package ch11_api_class.sec06;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// getBytes() 예제
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : "+ bytes1.length);
		
		String str1= new String(bytes1);
		System.out.println("bytes1->String : "+str1);
		
		// 현재 인코딩 방식 : MS949 (한글 2바이트)
		// UTF-8인 경우 한글 3바이트
		// 맥은 한글 3바이트
		
		byte[] bytes2 =str.getBytes("EUC-KR");
		System.out.println("bytes2.length : "+ bytes2.length);
		
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length : "+ bytes3.length);

	}

}
