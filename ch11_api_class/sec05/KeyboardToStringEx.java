package ch11_api_class.sec05;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("�Է� : ");
		
		int readByteNo = System.in.read(bytes);
		
		System.out.println(readByteNo+"����Ʈ");
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
	}

}
