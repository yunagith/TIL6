package ch11_api_class.sec07;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// Random Ŭ���� ����
		
		// ������ ������ �ٸ� ���� ����
		/*Random r = new Random();
		
		for(int i=1; i<5;i++) {
			System.out.println(r.nextInt(10)+1+ " ");
		}*/
		
		// seed �� ���� : ������ ������ ������ ���� ����
		Random r = new Random(3);
		
		for(int i=1; i<=5;i++) {
			System.out.print(r.nextInt(10)+1+ " ");
		}

	}

}
