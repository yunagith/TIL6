package ch11_api_class.sec07;

public class MathEx {

	public static void main(String[] args) {
		// Math Ŭ���� ����
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(5.3));	// �ø� : 6.0
		System.out.println(Math.floor(5.3));	// ���� : 5.0
		
		System.out.println(Math.max(5, 9));
		System.out.println(Math.max(5.3, 2.5));
		
		System.out.println(Math.min(5, 9));
		System.out.println(Math.min(5.3, 2.5));
		
		System.out.println(Math.random()); //0~1.0 ���̿� �Ǽ� 
		
		System.out.println(Math.rint(5.3));	//5.0 (����� ������ �Ǽ���)
		System.out.println(Math.rint(5.7));	//6.0
		System.out.println(Math.rint(5.5));	//6.0
		
		System.out.println(Math.round(5.3));		// 5
		System.out.println(Math.round(5.7));		// 6
		System.out.println(Math.round(5.5));		// 6
	}

}
