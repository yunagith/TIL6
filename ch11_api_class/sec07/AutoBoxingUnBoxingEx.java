package ch11_api_class.sec07;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// �ڵ� �ڽ�/ ��ڽ� ����
		
		// �ڵ� Boxing
		Integer obj = 100; //�ڵ� �ڽ�
		System.out.println(obj.intValue());
		
		// ���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println(value);
		
		// ���� �� �ڵ� UnBoxing
		int result =obj+100;
		System.out.println(result);
	}

}
