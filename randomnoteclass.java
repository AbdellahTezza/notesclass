package helloword;

import java.util.Random;

public class Tableauxmultidimensionnels {
	public static void main(String[] args) {
		
		int min = 1;  
		int max = 20;  
      	Random r=new Random();        
      	int at = r.nextInt(max - min + 1) + min;
		//System.out.println(at);  
		String[] tb1 = {"Abdellah", "Nabil", "Sami", "Anouar"};
		int[] arr = new int[4];
		for(int i=0, nbrRows = tb1.length;  i < nbrRows; ++i) {
			arr[i] = r.nextInt(max - min + 1) + min;
			if(arr[i] >= 10) {
			System.out.println(tb1[i] + " " + arr[i] );
			}
		}
 	}

}
