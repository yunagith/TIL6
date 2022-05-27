package ch11_api_class.sec06;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// getBytes() ����
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : "+ bytes1.length);
		
		String str1= new String(bytes1);
		System.out.println("bytes1->String : "+str1);
		
		// ���� ���ڵ� ��� : MS949 (�ѱ� 2����Ʈ)
		// UTF-8�� ��� �ѱ� 3����Ʈ
		// ���� �ѱ� 3����Ʈ
		
		byte[] bytes2 =str.getBytes("EUC-KR");
		System.out.println("bytes2.length : "+ bytes2.length);
		
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length : "+ bytes3.length);

	}

}
