package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// kullanicidan bir harf isteyin 
	//kucuk harf ise konsola kucuk harf
	// buyuk harfse buyuk harf
  	// yoksa girdiginiz karakter harf degil 
		
		
		Scanner scan = new Scanner (System. in);
		System.out.println("lutfen bir harf girin");	
		char ilkHarf=scan.next().charAt(0);
		String sonuc =(ilkHarf=='a' && ilkHarf=='z'?  ilkHarf=='A'&& ilkHarf=='Z' ? 
				" kucuk harf" : "buyuk harf" :"karakter degil");
		
		System.out.println(sonuc);
		
		
		
		
	}}