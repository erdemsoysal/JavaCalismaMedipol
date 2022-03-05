package JavaFinalCalisma;

public class FinalOncesiTekrar {

	public static void main(String[] args) 
	{
		
		
		int[][] satisTablosu = new int[][] 
				{ 
					{ 700, 600, 650 }, 
					{ 900, 800, 700 }, 
					{ 300, 400, 350 }, 
					{ 500, 450, 470 },
					{ 600, 500, 480 } 
				};
				
				/*
				 * bellekteki satisTablosu dizisinin elemanlar�n�n ekrana yazd�r�lmas�
				 */
						
				//elemanlariEkranaYazdir(satisTablosu);
				
				/*
				 * Her marka i�in 3 ayl�k sat�� toplamlar�n� yani dizinin sat�r toplamlar�n�
				 * yazd�ral�m
				 */	
						
				//satirToplamlariYazdir(satisTablosu);
				
				/*
				 * Her ay i�in 5 markan�n sat�� toplamlar�n� yani tablodaki s�tunlar�n
				 * toplamlar�n� g�sterelim
				 */
						
				//sutunToplamlariYazdir(satisTablosu);
				
				/* 3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM */
						
				genelToplam(satisTablosu);
	}
	public static void elemanlariEkranaYazdir(int[][] tablo)
	{
		for (int i = 0; i < tablo.length; i++) 
		{
			for (int j = 0; j < tablo[0].length; j++) 
			{
				System.out.print(tablo[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void satirToplamlariYazdir(int[][] tablo)
	{
		int satirToplam = 0;
		for (int i = 0; i < tablo.length; i++) 
		{
			satirToplam = 0;
			for (int j = 0; j < tablo[0].length; j++) 
			{
				satirToplam = satirToplam + tablo[i][j];
				System.out.print(tablo[i][j] + " ");
			}
			System.out.print("---> Sat�r toplam = " + satirToplam);
			System.out.println();
		}
	}
	public static void sutunToplamlariYazdir(int[][] tablo)
	{
		int sutunToplam = 0;
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunToplam = 0;
			for (int i = 0; i < tablo.length; i++) 
			{
				sutunToplam = sutunToplam + tablo[i][j];
				System.out.print(tablo[i][j] + " ");
			}
			System.out.println("---> S�tun toplam = " + sutunToplam);
			System.out.println();
		}
	}
	public static void genelToplam(int[][] tablo) 
	{
		//Sat�r Toplam
		int satirToplam = 0;
		int satirGenelToplam = 0;
		for (int i = 0; i < tablo.length; i++) 
		{
			satirToplam = 0;
			for (int j = 0; j < tablo[0].length; j++) 
			{
				satirToplam = satirToplam + tablo[i][j];
				satirGenelToplam = satirGenelToplam + tablo[i][j];
				System.out.print(tablo[i][j] + " ");
			}
			System.out.print("---> Satir Toplam = " + satirToplam);
			System.out.println();
		}
		System.out.print("--------> Satir Genel Toplam -> " + satirGenelToplam + " <-");
		System.out.println();
		System.out.println();
		
		//S�tun Toplam
		int sutunToplam = 0;
		int sutunGenelToplam = 0;
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunToplam = 0;
			for (int i = 0; i < tablo.length; i++) 
			{
				sutunToplam = sutunToplam + tablo[i][j];
				sutunGenelToplam = sutunGenelToplam + tablo[i][j];
				System.out.print(tablo[i][j] + " ");
			}
			System.out.print("---> S�tun Toplam = " + sutunToplam);
			System.out.println();
		}
		System.out.print("----------------> S�tun Genel Toplam -> " + sutunGenelToplam + " <-");
		System.out.println();
		System.out.println();
		
		//Genel Toplam
		
		int genelToplam = satirGenelToplam + sutunGenelToplam;
		System.out.println("----------------------> Genel Toplam -> " + genelToplam + " <-");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
