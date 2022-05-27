package ch11_api_class.sec07;

public class StringBuilderEx {

	public static void main(String[] args) {
		// StringBuilder ����
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2");	// �ε��� 4�� ��ġ�� 2�߰�
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6');	// ���� ����ǥ�� ��� ����
		System.out.println(sb.toString());
		
		// start���� end-1����
		sb.replace(6, 13, "Book");		// 6���� �����ؼ� 13-1������ ���ڿ��� Book���� ��ġ
		System.out.println(sb.toString());
		
		sb.delete(4, 5);	// 4���� 5-1����(4~4:4) 1���� ����
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ� : "+length);
		
		String result = sb.toString();
				System.out.println(result);
	}

}
