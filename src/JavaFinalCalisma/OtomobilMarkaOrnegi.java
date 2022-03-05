package JavaFinalCalisma;

public class OtomobilMarkaOrnegi {

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
		 * bellekteki satisTablosu dizisinin elemanlarýnýn ekrana yazdýrýlmasý
		 */
				
		//elemanlariEkranaYazdir(satisTablosu);
		
		/*
		 * Her marka için 3 aylýk satýþ toplamlarýný yani dizinin satýr toplamlarýný
		 * yazdýralým
		 */	
				
		//satirToplamlari(satisTablosu);
		
		/*
		 * Her ay için 5 markanýn satýþ toplamlarýný yani tablodaki sütunlarýn
		 * toplamlarýný gösterelim
		 */
				
		//sutunToplamlari(satisTablosu);
		
		/* 3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM */
				
		genelToplam(satisTablosu);
	}
	public static void elemanlariEkranaYazdir(int[][] tablo) 
	{
		for (int i = 0; i < tablo.length; i++) 
		{
			for (int j = 0; j < tablo[0].length; j++) 
			{
				System.out.print(tablo[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void satirToplamlari(int[][] tablo) 
	{
		int satirToplam = 0;
		for (int i = 0; i < tablo.length; i++) 
		{
			satirToplam = 0;
			for (int j = 0; j < tablo[0].length; j++) 
			{
				satirToplam = satirToplam + tablo[i][j];
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Satýr Toplam = "+satirToplam);
			System.out.println();
		}
	}
	public static void sutunToplamlari(int[][] tablo) 
	{
		int sutunToplam = 0;
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunToplam = 0;
			for (int i = 0; i < tablo.length; i++) 
			{
				sutunToplam = sutunToplam + tablo[i][j];
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Sütun Toplam = "+sutunToplam);
			System.out.println();
		}
	}
	public static void genelToplam(int[][] tablo) 
	{
		//Satýr Toplam
		int satirToplam = 0;
		int genelToplamSatir = 0;
		
		for (int i = 0; i < tablo.length; i++) 
		{
			satirToplam = 0;
			for (int j = 0; j < tablo[0].length; j++) 
			{
				satirToplam = satirToplam + tablo[i][j];
				genelToplamSatir = genelToplamSatir + tablo[i][j];
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Satýr Toplam = "+satirToplam);
			System.out.println();
		}
		System.out.println(" -------> Genel Satýr Toplamý = " + genelToplamSatir);
		System.out.println();
		
		//Sütun Toplam
		
		int sutunToplam = 0;
		int genelToplamSutun = 0;
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunToplam = 0;
			for (int i = 0; i < tablo.length; i++) 
			{
				sutunToplam = sutunToplam + tablo[i][j];
				genelToplamSutun = genelToplamSutun + tablo[i][j];
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Sütun Toplam = "+sutunToplam);
			System.out.println();
		}
		System.out.println(" ---------------> Genel Sütun Toplamý = " + genelToplamSutun);
		System.out.println();
		
		//GENEL TOPLAM
		
		int satirSutunGenelToplam = genelToplamSatir + genelToplamSutun;
		System.out.println("Satýr ve Sütunlarýn Genel Toplamý = " + satirSutunGenelToplam);
		
	}
	
	
	
	
	
	
	
	
	
}
