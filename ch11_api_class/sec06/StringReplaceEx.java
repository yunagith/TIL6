package ch11_api_class.sec06;

public class StringReplaceEx {

	public static void main(String[] args) {
		// replace() ����
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
