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
		 * bellekteki satisTablosu dizisinin elemanlar�n�n ekrana yazd�r�lmas�
		 */
				
		//elemanlariEkranaYazdir(satisTablosu);
		
		/*
		 * Her marka i�in 3 ayl�k sat�� toplamlar�n� yani dizinin sat�r toplamlar�n�
		 * yazd�ral�m
		 */	
				
		//satirToplamlari(satisTablosu);
		
		/*
		 * Her ay i�in 5 markan�n sat�� toplamlar�n� yani tablodaki s�tunlar�n
		 * toplamlar�n� g�sterelim
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
			System.out.print("---> Sat�r Toplam = "+satirToplam);
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
			System.out.print("---> S�tun Toplam = "+sutunToplam);
			System.out.println();
		}
	}
	public static void genelToplam(int[][] tablo) 
	{
		//Sat�r Toplam
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
			System.out.print("---> Sat�r Toplam = "+satirToplam);
			System.out.println();
		}
		System.out.println(" -------> Genel Sat�r Toplam� = " + genelToplamSatir);
		System.out.println();
		
		//S�tun Toplam
		
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
			System.out.print("---> S�tun Toplam = "+sutunToplam);
			System.out.println();
		}
		System.out.println(" ---------------> Genel S�tun Toplam� = " + genelToplamSutun);
		System.out.println();
		
		//GENEL TOPLAM
		
		int satirSutunGenelToplam = genelToplamSatir + genelToplamSutun;
		System.out.println("Sat�r ve S�tunlar�n Genel Toplam� = " + satirSutunGenelToplam);
		
	}
	
	
	
	
	
	
	
	
	
}
