package helloword;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Resultanote1 {
    private static Double totlemath;
	private static double math;
	private static double Info;
	private static double Arabe;
	private static double totleArabe;
	private static double totleInfor;
	private static double totoalall;
	public static void main(String[] args) {
		
		//double  total = 0; 
	    Scanner scan = new Scanner(System.in);
	    ArrayList<String> Nom = new ArrayList<String>();
	    System.out.print("Enter votre Nom : ");
	    Nom.add(scan.next());
	    
	    ArrayList<Integer> Nombre = new ArrayList<>();
	    System.out.print("Enter votre Nombre : ");
	    Nombre.add(scan.nextInt());
	    //String Nombreo = Nombre.toString();
	    

	    
	    /* matier math */
	    ArrayList<Double> matieremath = new ArrayList<>();
	    System.out.print("Enter votre math : ");
	    math = scan.nextDouble();
	    totlemath  =  (math  *  4)/ 10;
	    System.out.println ( "Note de math est : "  +  totlemath   ); 
	    
	    /* matier Info */
	    ArrayList<Double> matiereinfo = new ArrayList<>();
	    System.out.print("Enter votre note Info : ");
	    Info = scan.nextDouble();
	    totleInfor  =  (Info  *  3 )/ 10;
	    System.out.println ( "Note de Info est : "  +  totleInfor  ); 
	   // 
	    
	    /* matier Arabe */
	    ArrayList<Double> matierearabe = new ArrayList<>();
	    System.out.print("Enter votre note Arabe : ");
	    Arabe = scan.nextDouble();
	    totleArabe  =  (Arabe  *  3)/ 10;
	    System.out.println ( "Note de Arabe est : "  +  totleArabe  ); 
	    //
	    matieremath.add(totlemath);
	    matiereinfo.add(totleInfor);
	    matierearabe.add(totleArabe);
	    Map<String, List> resulta = new HashMap<>();
	    resulta.put("Nom ", Nom);
	    resulta.put("Math", matieremath);
	    resulta.put("Info", matiereinfo);
	    resulta.put("Arabe", matierearabe);
	    totoalall = ((totleArabe * 3) + (totleInfor * 3) + (totlemath * 4))/10;
	    System.out.println( resulta ); 
	    System.out.println( "Résultat finale de  " + Nom.get(0) +"  est :" + totoalall ); 
	    
	    
	}

}
