package JavaFinalCalisma;

public class CokBoyutluDiziEnKucukEnBuyuk {

	public static void main(String[] args) 
	{
		int[][] tablo = new int[][] 
				{
					{34,11,-7,53},
					{254,8,-65,4},
					{110,64,33,26}
				};
				
		System.out.println("Tablodaki en k���k eleman ---> " + enKucukElemaniBul(tablo));
		System.out.println("Tablodaki en b�y�k eleman ---> " + enBuyukElemaniBul(tablo));
		System.out.println("---------------------");
		satirdakiEnKucukEleman(tablo);
		System.out.println("---------------------");
		satirdakiEnBuyukEleman(tablo);
		System.out.println("---------------------");
		sutundakiEnKucukEleman(tablo);
		System.out.println("---------------------");
		sutundakiEnBuyukEleman(tablo);
	}
	
	
	
	public static int enKucukElemaniBul(int[][] tablo) 
	{
		int enKucukEleman = tablo[0][0]; //0'a 0'� en k���k eleman olarak varsay�yoruz.
		
		for (int i = 0; i < tablo.length; i++) 
		{
			for (int j = 0; j < tablo[i].length; j++) 
			{
				if (enKucukEleman > tablo[i][j]) //for d�ng�s� diziyi tararken en k���k eleman o an geldi�i elemandan k���k m� kontrol
				{
					enKucukEleman = tablo[i][j];
				}
			}
		}
		return enKucukEleman;
	}
	public static int enBuyukElemaniBul(int[][] tablo) 
	{
		int enBuyukEleman = tablo[0][0];
		for (int i = 0; i < tablo.length; i++) 
		{
			for (int j = 0; j < tablo[i].length; j++) 
			{
				if (enBuyukEleman < tablo[i][j]) 
				{
					enBuyukEleman = tablo[i][j];
				}
			}
		}
		return enBuyukEleman;
		
	}
	public static void satirdakiEnKucukEleman(int[][] tablo) 
	{
		int satirEnKucuk = tablo[0][0];
		for (int i = 0; i < tablo.length; i++) 
		{
			satirEnKucuk = tablo[0][0];
			for (int j = 0; j < tablo[0].length; j++) 
			{
				if (satirEnKucuk > tablo[i][j]) 
				{
					satirEnKucuk = tablo[i][j];
				}
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Sat�r en k���k = " + satirEnKucuk);
			System.out.println();
		}
	}
	public static void satirdakiEnBuyukEleman(int[][] tablo) 
	{
		int satirEnBuyuk = tablo[0][0];
		for (int i = 0; i < tablo.length; i++) 
		{
			satirEnBuyuk = tablo[0][0];
			for (int j = 0; j < tablo[0].length; j++) 
			{
				if (satirEnBuyuk < tablo[i][j]) 
				{
					satirEnBuyuk = tablo[i][j];
				}
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> Sat�r en b�y�k = " + satirEnBuyuk);
			System.out.println();
		}
	}
	public static void sutundakiEnKucukEleman(int[][] tablo) 
	{
		int sutunEnKucuk = tablo[0][0];
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunEnKucuk = tablo[0][0];
			for (int i = 0; i < tablo.length; i++) 
			{
				if (sutunEnKucuk > tablo[i][j]) 
				{
					sutunEnKucuk = tablo[i][j];
				}
				System.out.print(tablo[i][j]+" ");
			}
			System.out.print("---> S�tun en k���k = " + sutunEnKucuk);
			System.out.println();
		}
	}
	public static void sutundakiEnBuyukEleman(int[][] tablo) 
	{
		int sutunEnBuyuk = tablo[0][0];
		for (int j = 0; j < tablo[0].length; j++) 
		{
			sutunEnBuyuk = tablo[0][0];
			for (int i = 0; i < tablo.length; i++) 
			{
				if (sutunEnBuyuk < tablo[i][j]) 
				{
					sutunEnBuyuk = tablo[i][j];
				}
				System.out.print(tablo[i][j] + " ");
			}
			System.out.print("---> S�tun en b�y�k = " + sutunEnBuyuk);
			System.out.println();
		}
	}
	
}
