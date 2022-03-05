package Calisma1;
import java.util.Scanner;
public class JavaWhileCalismalari {

	public static void main(String[] args) 
	{
		//girilen sayýya kadar sayan bir program
		/*
		int girdi;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Lütfen kaça kadar sayýlmasýný istediðinizi giriniz: ");
		girdi = scan.nextInt();
		
		while (i <= girdi) 
		{
			System.out.println((float)i); //cast iþlemi int'i float'a çevirdik.
			i++;
		}
		*/
		
		//faktöriyel hesaplama
		int faktoriyel = 1;
		int girdi;
		int geciciGirdi;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Lütfen kaç faktöriyel bulmak istediðinizi giriniz: ");
		girdi = scan.nextInt();
		
		geciciGirdi = girdi;
		while (geciciGirdi > 1) 
		{
			System.out.println(faktoriyel + " * " + geciciGirdi);
			faktoriyel *= geciciGirdi;
			geciciGirdi--;
		}
		System.out.println(" Faktöriyel = " + faktoriyel);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
