package ch11_api_class.sec06;

public class StringIndexOfEx {

	public static void main(String[] args) {
		// indexOf() ����
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�")==-1) {// �� ã�� ��� (���ԵǾ� ���� ���� ���)
			System.out.println("�ڹٿ� ������ ���� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}
		
		String email = "abc@abc.com";
		if(email.indexOf("@")==-1) {// �� ã�� ��� (���ԵǾ� ���� ���� ���)
			System.out.println("�̸��� ������ �ƴմϴ�.");
		}else {
			System.out.println("�̸��� ������ �½��ϴ�.");
		}
	}

}
