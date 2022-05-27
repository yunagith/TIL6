package ch11_api_class.sec07;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// StringTokenizerEx ����
		String text = "ȫ�浿/�̸���/������";
		
		// ��ū ���� ���1 : ��ü ��ū ���� �˾Ƴ��� for������ �ݺ� ó��
		StringTokenizer st = new StringTokenizer(text,"/"); // ������ : /
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		
		for(int i=0;i<countTokens;i++){
			String token = st.nextToken();
			System.out.println(token);
					
		}
		
		System.out.println();
		
		// ��ū ���� ���2 : �޼ҵ带 ����ؼ� ���� �ִ� ��ū�� Ȯ���ϰ� while ������ �ݺ� ó��
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
