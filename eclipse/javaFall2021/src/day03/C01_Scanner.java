package day03;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		 
			Scanner scan = new Scanner (System.in);
			System.out.println("Alanini hesplamak icin dairenin yari capini girin");
			
			double yaricap= scan.nextDouble();
			double cevre =2*3.14*yaricap;
			double alan= 3.14*yaricap*yaricap;
			
					
		
			
			System.out.println("dairenin cevresi " + cevre);
			
			System.out.println("dairenin alani=" + alan);
			}

	
	
	
	
	
	
	
	
	
	
	
	}


