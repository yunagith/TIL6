package ch11_api_class.sec03;

public class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
	
	// Throwable Ŭ���� : Java ����� ��� ������ ������ ���� Ŭ����
	//Throwable (���� Ŭ����)
	// Exception / Error (���� Ŭ����)
	
}
