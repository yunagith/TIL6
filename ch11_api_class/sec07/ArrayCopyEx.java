package ch11_api_class.sec07;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// �迭 ���� ����
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		// ���1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// ���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // 1~(3-1)
		System.out.println(Arrays.toString(arr3));
		
		// ���3
		char[] arr4= new char[arr1.length]; // Ÿ�� �迭 ����
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0;i<arr4.length;i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
		}

	}

}
