package ch11_api_class.sec07;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortEx {

	public static void main(String[] args) {
		// ArraysSort() ����
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
			
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�̸���", "������"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
	}
		System.out.println();
		
	// ���� : Collections.reverseOrder()
		Arrays.sort(names, Collections.reverseOrder());
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
	}
		System.out.println();
		// ���� : int[]�� ��� �Ұ�
		//Arrays.sort(scores, Collections.reverseOrder());
		
		Integer[] scores2 = {10, 99, 30, 40, 55};
		Arrays.sort(scores2, Collections.reverseOrder());
		for(int i=0;i<scores2.length;i++) {
			System.out.print(scores2[i]+" ");
	}
}
}












