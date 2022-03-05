package JavaFinalCalisma;

import java.util.Scanner;

public class FinalOncesiTekrar3 {

	public static void main(String[] args) 
	{
		/*
		 * 	Write a java conditional ​statement that implements
 			the​ ​table below, where ​grade​ is an integer 
 			and ​school​ is a string. Both variables have been declared and ​grade ​has been initialized to a value greater than or equal to 1:
  			If ​grade​ is: 			Set ​school​ to:
  			1, 2, 3, 4, 5			Elementary School
  			6, 7, 8				Junior High
  			9, 10, 11, 12			High School
   			> 12					College
   
		 */
		
		sinifBelirle();
	}
	public static void sinifBelirle() 
	{
		int girdi;
		String[] siniflar = {"ilkOkul","ortaOkul","Lise","Üniversite"};
		String mevcutSinif;
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Lütfen sınıfınızı giriniz: ");
		girdi = scanInput.nextInt();
		
		if (girdi > 0 && girdi <= 5) 
		{
			mevcutSinif = siniflar[0];
			System.out.print("Sınıfınız --> " + mevcutSinif);
		}
		if (girdi >= 6 && girdi <= 8) 
		{
			mevcutSinif = siniflar[1];
			System.out.print("Sınıfınız --> " + mevcutSinif);
		}
		if (girdi >= 9 && girdi <= 12) 
		{
			mevcutSinif = siniflar[2];
			System.out.print("Sınıfınız --> " + mevcutSinif);
		}
		if (girdi > 12) 
		{
			mevcutSinif = siniflar[3];
			System.out.print("Sınıfınız --> " + mevcutSinif);
		}
		
	}
	

}
