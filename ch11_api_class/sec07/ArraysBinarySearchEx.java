package ch11_api_class.sec07;

import java.util.Arrays;

public class ArraysBinarySearchEx {

	public static void main(String[] args) {
		// ArraysBinarySearchEx() ����
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println((index+1)+"��° ��ġ");
		
		System.out.println();
		
		String[] names = {"ȫ�浿", "���ڹ�", "�̸���", "������"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "�̸���");
		System.out.println((index+1)+"��° ��ġ");
	}
		

	}

