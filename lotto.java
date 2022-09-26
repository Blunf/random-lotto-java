package javatask;

import java.util.Random;

public class lotto { 

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1; 
			for(int x = 0; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				} 
			}
		} 
		
		for(int i = 0; i < lotto.length; i++) {
			for(int k = i + 1; k < lotto.length; k++) {
				if(lotto[i] > lotto[k]) {
					int temp = lotto[i];
					lotto[i] = lotto[k];
					lotto[k] = temp;
				} 
			} 
		} 
        
        System.out.print("Lotto numbers : ");
        for (int i = 0; i < lotto.length; i++) {            
        System.out.print(lotto[i]+"  ");
        }
	} 
}