package ch11_api_class.sec03;

public class FinalizeMain {

	public static void main(String[] args) {
		// finalize() �޼ҵ� ����
		Counter counter = null;
		
		for(int i=1; i<=50; i++) {
			counter = new Counter(i); // ��ü ����
			counter = null; 
			System.gc();
		}

	}

}
// ������� �Ҹ���� �ʰ� ���Ƿ� �Ҹ�
// ���� �Ҹ�Ǵ� ���� �ƴ϶� �޸� ���¸� ���� �Ϻθ� �Ҹ� 