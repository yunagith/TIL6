package ch11_api_class.sec06;

public class StringCharAtEx {

	public static void main(String[] args) {
		// charAt() �޼ҵ� ����
		String ssn = "010203-1234123";
		
		// ���� Ȯ���ؼ� ���
		// Switch �� ���
		// �����Դϴ�
		
		char charValue = ssn.charAt(7);
		
		switch(charValue) {
		case '1':System.out.println("�����Դϴ�."); break;
		case '2':System.out.println("�����Դϴ�."); break;
		case '3':System.out.println("�����Դϴ�."); break;
		case '4':System.out.println("�����Դϴ�."); break;
	    default: System.out.println("�߸� �Է��Ͽ����ϴ�.");
		
		}

	}

}
