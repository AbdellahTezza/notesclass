package helloword;

public class Noteclass {

	public static void main(String[] args) {
		String[][] tb1 = {
				{"10", "Abdellah"}, {"19", "Nabil"}, {"10", "Sami"},{"9", "Anouar"}
				};
		for(int i=0, nbrRows = tb1.length;  i < nbrRows; ++i) {
			int numbero = Integer.parseInt(tb1[i][0]);
			if(numbero >= 10) {
			for(int j=0, Colonsrow = tb1[i].length; j < Colonsrow; ++j ) {
				System.out.print(tb1[i][j] +" ");
				}	
			}
			System.out.println();	
		}

	}

}
