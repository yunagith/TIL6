package ch11_api_class.sec07;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortEx {

	public static void main(String[] args) {
		// ArraysSort() ¿¹Á¦
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
			
		}
		System.out.println();
		
		String[] names = {"È«±æµ¿", "ÀÌ¸ù·æ", "¼ºÃáÇâ"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
	}
		System.out.println();
		
	// ¿ª¼ø : Collections.reverseOrder()
		Arrays.sort(names, Collections.reverseOrder());
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
	}
		System.out.println();
		// ÁÖÀÇ : int[]Àº »ç¿ë ºÒ°¡
		//Arrays.sort(scores, Collections.reverseOrder());
		
		Integer[] scores2 = {10, 99, 30, 40, 55};
		Arrays.sort(scores2, Collections.reverseOrder());
		for(int i=0;i<scores2.length;i++) {
			System.out.print(scores2[i]+" ");
	}
}
}












