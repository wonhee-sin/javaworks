package scorearray;

import java.util.Arrays;

public class SortEx2 {
	public static void main(String[] args) {
		char[] tiger = {'T', 'I', 'G', 'E', 'R'};
		int i, j;
		char temp = '0';
		
		for (i = 0; i < tiger.length; i++) {
			for(j = 0; j < tiger.length; j++) {
				if (tiger[i] < tiger[j]) {
					temp = tiger[i];
					tiger[i] = tiger[j];
					tiger[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(tiger));
		
		for (i = 0; i < tiger.length; i++) {
			System.out.print((int)tiger[i] + " ");
		}
	}
}
